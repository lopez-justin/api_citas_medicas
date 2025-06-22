package com.justindev.gestioncitasmedicas.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "Citas")
public class CitaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Cita", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Id_Paciente", nullable = false)
    private PacienteEntity idPaciente;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Id_Medico", nullable = false)
    private MedicoEntity idMedico;

    @Column(name = "fecha_Hora", nullable = false)
    private Instant fechaHora;

    @Column(name = "Fecha_Cita", nullable = false)
    private Instant fechaCita;

    @Column(name = "Motivo")
    private String motivo;

    @ColumnDefault("'Pendiente'")
    @Column(name = "Estado", length = 20)
    private String estado;

    @OneToMany(mappedBy = "idCita")
    private Set<DiagnosticoEntity> diagnosticos = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idCita")
    private Set<FacturaEntity> facturas = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idCita")
    private Set<HistorialCitaEntity> historialCitas = new LinkedHashSet<>();

}