package com.justindev.gestioncitasmedicas.procedimientos.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Setter @Getter
@NoArgsConstructor @AllArgsConstructor
public class BuscarPacientesEntity {

    @Id
    private Integer idPaciente;

    private String nombre;

    private String apellido;

    private Date fechaNacimiento;

    private String genero;

    private String telefono;

    private String email;

    private String direccion;

    private Integer totalCitas;
}
