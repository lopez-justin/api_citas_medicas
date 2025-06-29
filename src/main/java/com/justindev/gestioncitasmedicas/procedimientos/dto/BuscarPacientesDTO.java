package com.justindev.gestioncitasmedicas.procedimientos.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BuscarPacientesDTO {
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
