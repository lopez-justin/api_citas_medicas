package com.justindev.gestioncitasmedicas.consultas.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class IngresoMensualDTO {

    private String mes;
    private BigDecimal ingresoTotal;

}
