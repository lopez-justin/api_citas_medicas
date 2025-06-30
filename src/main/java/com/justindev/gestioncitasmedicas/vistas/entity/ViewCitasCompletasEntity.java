package com.justindev.gestioncitasmedicas.vistas.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Immutable;

import java.time.Instant;

/**
 * Mapping for DB view
 */
@Getter
@Setter
@Entity
@Immutable
@Table(name = "view_citas_completas")
public class ViewCitasCompletasEntity {
    @Id
    @Column(name = "Id_Cita", nullable = false)
    private Integer idCita;

    @Column(name = "Fecha_Cita", nullable = false)
    private Instant fechaCita;

    @Column(name = "Motivo")
    private String motivo;

    @Column(name = "Estado", length = 20)
    private String estado;

    @Column(name = "NombrePaciente", nullable = false, length = 101)
    private String nombrePaciente;

    @Column(name = "TelefonoPaciente", length = 15)
    private String telefonoPaciente;

    @Column(name = "EmailPaciente", length = 50)
    private String emailPaciente;

    @Column(name = "NombreMedico", nullable = false, length = 101)
    private String nombreMedico;

    @Column(name = "Especialidad", length = 50)
    private String especialidad;

    @Column(name = "TelefonoMedico", length = 15)
    private String telefonoMedico;

}