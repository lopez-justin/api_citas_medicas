package com.justindev.gestioncitasmedicas.consultas.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
public class CitaCanceladaDTO {

    private Integer idCita;
    private String paciente;
    private String medico;
    private Instant fechaCita;
    private String estadoAnterior;
    private String estadoNuevo;
    private String notas;

}
