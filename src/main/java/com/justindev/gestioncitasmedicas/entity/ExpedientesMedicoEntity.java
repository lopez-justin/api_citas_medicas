package com.justindev.gestioncitasmedicas.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "Expedientes_Medicos")
public class ExpedientesMedicoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Expediente", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Id_Paciente", nullable = false)
    private PacienteEntity idPaciente;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Id_Medico", nullable = false)
    private MedicoEntity idMedico;

    @Column(name = "Fecha_Consulta", nullable = false)
    private Instant fechaConsulta;

    @Lob
    @Column(name = "Diagnostico")
    private String diagnostico;

    @Lob
    @Column(name = "Tratamiento")
    private String tratamiento;

    @Lob
    @Column(name = "Notas")
    private String notas;

}