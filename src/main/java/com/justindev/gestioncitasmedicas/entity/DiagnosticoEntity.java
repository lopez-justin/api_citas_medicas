package com.justindev.gestioncitasmedicas.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Diagnosticos")
public class DiagnosticoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Diagnostico", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Id_Cita", nullable = false)
    private CitaEntity idCita;

    @Lob
    @Column(name = "Diagnostico", nullable = false)
    private String diagnostico;

    @Lob
    @Column(name = "NotasAdicionales")
    private String notasAdicionales;

}