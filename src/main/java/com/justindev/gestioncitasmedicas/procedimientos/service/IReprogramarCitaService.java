package com.justindev.gestioncitasmedicas.procedimientos.service;

import com.justindev.gestioncitasmedicas.procedimientos.dto.ReprogramarCitaDTO;
import com.justindev.gestioncitasmedicas.procedimientos.dto.ReprogramarCitaResponseDTO;

public interface IReprogramarCitaService {

    ReprogramarCitaResponseDTO reprogramarCita(ReprogramarCitaDTO reprogramarCitaDTO);
}
