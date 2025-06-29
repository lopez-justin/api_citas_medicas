package com.justindev.gestioncitasmedicas.procedimientos.service;

import com.justindev.gestioncitasmedicas.procedimientos.dto.AgendaMedicoDTO;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface IAgendaMedicoService {

    List<AgendaMedicoDTO> obtenerAgendaMedico(Integer idMedico, Date fechaInicio, Date fechaFin);

}
