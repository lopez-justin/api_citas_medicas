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
@Table(name = "view_resumen_pacientes")
public class ViewResumenPacienteEntity {
    @Id
    @Column(name = "Id_Paciente", nullable = false)
    private Integer idPaciente;

    @Column(name = "NombreCompleto", nullable = false, length = 101)
    private String nombreCompleto;

    @Column(name = "Telefono", length = 15)
    private String telefono;

    @Column(name = "Email", length = 50)
    private String email;

    @Column(name = "Genero", length = 10)
    private String genero;

    @Column(name = "TotalCitas")
    private Integer totalCitas;

    @Column(name = "UltimaCita")
    private Instant ultimaCita;

    @Column(name = "CitasCompletadas")
    private Integer citasCompletadas;

    @Column(name = "CitasCanceladas")
    private Integer citasCanceladas;

}