package com.justindev.gestioncitasmedicas.vistas.service;

import com.justindev.gestioncitasmedicas.vistas.entity.ViewResumenPacienteEntity;
import com.justindev.gestioncitasmedicas.vistas.repository.IViewResumenPacienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ViewResumenPacienteService implements IViewResumenPacienteService {

    private final IViewResumenPacienteRepository viewResumenPacienteRepository;


    @Override
    public ViewResumenPacienteEntity obtenerResumenPacientePorId(Integer idPaciente) {
        return this.viewResumenPacienteRepository.findByIdPaciente(idPaciente);
    }
}
