package com.justindev.gestioncitasmedicas.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "Facturas")
public class FacturaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Factura", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Id_Paciente", nullable = false)
    private PacienteEntity idPaciente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Id_Cita")
    private CitaEntity idCita;

    @ColumnDefault("getdate()")
    @Column(name = "FechaEmision")
    private Instant fechaEmision;

    @Column(name = "Total", nullable = false, precision = 10, scale = 2)
    private BigDecimal total;

    @Column(name = "MetodoPago", length = 50)
    private String metodoPago;

    @ColumnDefault("'Pagada'")
    @Column(name = "Estado", length = 20)
    private String estado;

}