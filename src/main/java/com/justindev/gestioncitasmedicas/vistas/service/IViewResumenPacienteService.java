package com.justindev.gestioncitasmedicas.vistas.service;

import com.justindev.gestioncitasmedicas.vistas.entity.ViewResumenPacienteEntity;

public interface IViewResumenPacienteService {

    ViewResumenPacienteEntity obtenerResumenPacientePorId(Integer idPaciente);

}
