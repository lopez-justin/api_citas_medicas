package com.justindev.gestioncitasmedicas.consultas.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@AllArgsConstructor
@Getter @Setter
public class HistorialCitaDTO {

    private Integer idCita;
    private String medico;
    private String especialidad;
    private Instant fechaCita;
    private String motivo;
    private String estado;

}
