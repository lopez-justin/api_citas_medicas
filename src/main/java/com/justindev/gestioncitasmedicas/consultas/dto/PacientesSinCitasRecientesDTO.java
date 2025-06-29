package com.justindev.gestioncitasmedicas.consultas.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class PacientesSinCitasRecientesDTO {

    private Integer idPaciente;
    private String nombre;
    private String apellido;
    private String telefono;
    private Instant ultimaCita;

}
