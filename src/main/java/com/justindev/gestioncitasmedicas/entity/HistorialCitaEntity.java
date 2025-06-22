package com.justindev.gestioncitasmedicas.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "Historial_Citas")
public class HistorialCitaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Historial", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Id_Cita", nullable = false)
    private CitaEntity idCita;

    @ColumnDefault("getdate()")
    @Column(name = "Fecha_Modificacion", nullable = false)
    private Instant fechaModificacion;

    @Column(name = "Estado_Anterior", length = 20)
    private String estadoAnterior;

    @Column(name = "Estado_Nuevo", length = 20)
    private String estadoNuevo;

    @Lob
    @Column(name = "Notas")
    private String notas;

}