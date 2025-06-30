package com.justindev.gestioncitasmedicas.vistas.service;

import com.justindev.gestioncitasmedicas.vistas.entity.ViewCitasCompletasEntity;
import com.justindev.gestioncitasmedicas.vistas.repository.IViewCitasCompletaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ViewCitasCompletaService implements IViewCitasCompletaService {

    private final IViewCitasCompletaRepository vwCitasCompletaRepository;

    @Override
    public ViewCitasCompletasEntity obtenerCitaCompletaPorId(Integer idCita) {
        return this.vwCitasCompletaRepository.findByIdCita(idCita);
    }

}
