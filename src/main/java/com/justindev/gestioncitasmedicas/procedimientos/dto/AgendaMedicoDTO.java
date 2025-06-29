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
public class AgendaMedicoDTO {
    private Integer idCita;
    private Date fechaCita;
    private String motivo;
    private String estado;
    private String nombrePaciente;
    private String telefono;
    private Integer edadPaciente;
}
