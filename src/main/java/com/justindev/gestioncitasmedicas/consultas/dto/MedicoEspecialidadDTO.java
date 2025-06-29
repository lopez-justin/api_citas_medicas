package com.justindev.gestioncitasmedicas.consultas.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
public class MedicoEspecialidadDTO {

    private Integer idMedico;
    private String medico;
    private String especialidad;

}
