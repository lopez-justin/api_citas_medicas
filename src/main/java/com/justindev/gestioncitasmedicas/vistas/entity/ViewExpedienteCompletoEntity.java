package com.justindev.gestioncitasmedicas.vistas.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Immutable;

import java.time.Instant;
import java.time.LocalDate;

/**
 * Mapping for DB view
 */
@Getter
@Setter
@Entity
@Immutable
@Table(name = "VW_ExpedientesCompletos")
public class ViewExpedienteCompletoEntity {
    @Id
    @Column(name = "Id_Expediente", nullable = false)
    private Integer idExpediente;

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

    @Column(name = "NombrePaciente", nullable = false, length = 101)
    private String nombrePaciente;

    @Column(name = "Fecha_Nacimiento", nullable = false)
    private LocalDate fechaNacimiento;

    @Column(name = "NombreMedico", nullable = false, length = 101)
    private String nombreMedico;

    @Column(name = "Especialidad", length = 50)
    private String especialidad;

}