package com.justindev.gestioncitasmedicas.procedimientos.service;

import com.justindev.gestioncitasmedicas.procedimientos.dto.BuscarPacientesDTO;

import java.util.List;

public interface IBuscarPacientesService {

    List<BuscarPacientesDTO> buscarPacientes(String nombre, String apellido, String telefono, String email);
}
