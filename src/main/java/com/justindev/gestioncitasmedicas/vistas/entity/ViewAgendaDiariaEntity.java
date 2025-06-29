package com.justindev.gestioncitasmedicas.vistas.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Immutable;

import java.time.LocalDate;

/**
 * Mapping for DB view
 */
@Getter
@Setter
@Entity
@Immutable
@Table(name = "vw_AgendaDiaria")
public class ViewAgendaDiariaEntity {
    @Id
    @Column(name = "Id_Medico", nullable = false)
    private Integer idMedico;

    @Column(name = "NombreMedico", nullable = false, length = 101)
    private String nombreMedico;

    @Column(name = "Especialidad", length = 50)
    private String especialidad;

    @Column(name = "Fecha")
    private LocalDate fecha;

    @Column(name = "TotalCitas")
    private Integer totalCitas;

    @Column(name = "CitasPendientes")
    private Integer citasPendientes;

    @Column(name = "CitasCompletadas")
    private Integer citasCompletadas;

    @Column(name = "CitasCanceladas")
    private Integer citasCanceladas;

}