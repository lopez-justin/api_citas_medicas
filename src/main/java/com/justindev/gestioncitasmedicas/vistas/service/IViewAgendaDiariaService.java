package com.justindev.gestioncitasmedicas.vistas.service;

import com.justindev.gestioncitasmedicas.vistas.entity.ViewAgendaDiariaEntity;

public interface IViewAgendaDiariaService {

    ViewAgendaDiariaEntity obtenerAgendaDiariaPorMedico(Integer idMedico);

}
