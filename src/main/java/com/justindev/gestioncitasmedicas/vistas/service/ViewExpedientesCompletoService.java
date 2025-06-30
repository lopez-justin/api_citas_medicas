package com.justindev.gestioncitasmedicas.vistas.service;

import com.justindev.gestioncitasmedicas.vistas.entity.ViewExpedientesCompletoEntity;
import com.justindev.gestioncitasmedicas.vistas.repository.IViewExpedientesCompletoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ViewExpedientesCompletoService implements IViewExpedientesCompletoService {

    private final IViewExpedientesCompletoRepository viewExpedientesCompletoRepository;

    @Override
    public ViewExpedientesCompletoEntity obtenerExpedienteCompletoPorId(Integer idExpediente) {
        return this.viewExpedientesCompletoRepository.findByIdExpediente(idExpediente);
    }
}
