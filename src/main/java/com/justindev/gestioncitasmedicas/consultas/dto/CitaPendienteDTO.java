package com.justindev.gestioncitasmedicas.consultas.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@AllArgsConstructor
@Getter @Setter
public class CitaPendienteDTO {

    private Integer idCita;
    private String paciente;
    private Instant fechaCita;
    private String motivo;

}
