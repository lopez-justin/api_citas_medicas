package com.justindev.gestioncitasmedicas.vistas.service.impl;

import com.justindev.gestioncitasmedicas.vistas.entity.ViewCitasCompletaEntity;
import com.justindev.gestioncitasmedicas.vistas.repository.ViewCitasCompletaRepository;
import com.justindev.gestioncitasmedicas.vistas.service.IViewCitasCompletaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ViewCitasCompletaService implements IViewCitasCompletaService {

    private final ViewCitasCompletaRepository vwCitasCompletaRepository;

    @Override
    public ViewCitasCompletaEntity obtenerCitaCompletaPorId(Integer idCita) {
        return this.vwCitasCompletaRepository.obtenerCitaCompletaPorId(idCita);
    }

}
