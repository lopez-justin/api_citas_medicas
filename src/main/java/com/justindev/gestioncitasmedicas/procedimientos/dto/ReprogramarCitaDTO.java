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
public class ReprogramarCitaDTO {
    private Integer idCita;
    private Date nuevaFecha;
    private String notas;
}
