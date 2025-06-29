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
@Table(name = "Pacientes")
public class PacienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Paciente", nullable = false)
    private Integer id;

    @Column(name = "Nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "Apellido", nullable = false, length = 50)
    private String apellido;

    @Column(name = "Fecha_Nacimiento", nullable = false)
    private LocalDate fechaNacimiento;

    @Column(name = "Genero", length = 10)
    private String genero;

    @Column(name = "Direccion", length = 100)
    private String direccion;

    @Column(name = "Telefono", length = 15)
    private String telefono;

    @Column(name = "Email", length = 50)
    private String email;

    @ColumnDefault("getdate()")
    @Column(name = "Fecha_Registro", nullable = false)
    private LocalDate fechaRegistro;

    @ColumnDefault("1")
    @Column(name = "activo")
    private Boolean activo;

    @OneToMany(mappedBy = "idPaciente")
    private Set<CitaEntity> citas = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idPaciente")
    private Set<ExpedientesMedicoEntity> expedientesMedicos = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idPaciente")
    private Set<FacturaEntity> facturas = new LinkedHashSet<>();

}