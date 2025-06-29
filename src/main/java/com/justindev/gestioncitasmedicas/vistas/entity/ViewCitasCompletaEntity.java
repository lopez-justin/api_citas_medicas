package com.justindev.gestioncitasmedicas.vistas.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Immutable;

import java.time.Instant;


/**
 * Vista que representa una cita médica completa con información del paciente y médico.
 */
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@Entity
@Immutable
@Table(name = "VW_CitasCompletas")
public class ViewCitasCompletaEntity {

    @Id
    @Column(name = "Id_Cita")
    private Integer idCita;

    @Column(name = "Fecha_Cita")
    private Instant fechaCita;

    @Column(name = "Motivo")
    private String motivo;

    @Column(name = "Estado")
    private String estado;

    @Column(name = "NombrePaciente")
    private String nombrePaciente;

    @Column(name = "TelefonoPaciente")
    private String telefonoPaciente;

    @Column(name = "EmailPaciente")
    private String emailPaciente;

    @Column(name = "NombreMedico")
    private String nombreMedico;

    @Column(name = "Especialidad")
    private String especialidad;

    @Column(name = "TelefonoMedico")
    private String telefonoMedico;

}