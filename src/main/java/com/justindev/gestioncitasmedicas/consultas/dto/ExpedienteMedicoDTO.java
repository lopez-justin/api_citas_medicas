package com.justindev.gestioncitasmedicas.consultas.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
public class ExpedienteMedicoDTO {

    private Integer idExpediente;
    private Instant fechaConsulta;
    private String medico;
    private String especialidad;
    private String diagnostico;
    private String tratamiento;

}
