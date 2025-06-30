package com.justindev.gestioncitasmedicas.vistas.service;

import com.justindev.gestioncitasmedicas.vistas.entity.ViewAgendaDiariaEntity;
import com.justindev.gestioncitasmedicas.vistas.repository.IViewAgendaDiariaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ViewAgendaDiariaService implements IViewAgendaDiariaService {

    private final IViewAgendaDiariaRepository viewAgendaDiariaRepository;

    @Override
    public ViewAgendaDiariaEntity obtenerAgendaDiariaPorMedico(Integer idMedico) {
        return this.viewAgendaDiariaRepository.findByIdMedico(idMedico);
    }
}
