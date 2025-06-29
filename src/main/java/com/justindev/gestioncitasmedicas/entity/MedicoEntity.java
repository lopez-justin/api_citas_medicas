package com.justindev.gestioncitasmedicas.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "Medicos")
public class MedicoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Medico", nullable = false)
    private Integer id;

    @Column(name = "Nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "Apellido", nullable = false, length = 50)
    private String apellido;

    @Column(name = "Especialidad", length = 50)
    private String especialidad;

    @Column(name = "Telefono", length = 15)
    private String telefono;

    @Column(name = "Email", length = 50)
    private String email;

    @Column(name = "Fecha_Contratacion", nullable = false)
    private LocalDate fechaContratacion;

    @ColumnDefault("1")
    @Column(name = "activo")
    private Boolean activo;

    @OneToMany(mappedBy = "idMedico")
    private Set<CitaEntity> citas = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idMedico")
    private Set<EspecialidadesMedicoEntity> especialidadesMedicos = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idMedico")
    private Set<ExpedientesMedicoEntity> expedientesMedicos = new LinkedHashSet<>();

}