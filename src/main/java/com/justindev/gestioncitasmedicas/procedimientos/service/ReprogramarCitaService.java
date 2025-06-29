package com.justindev.gestioncitasmedicas.procedimientos.service;

import com.justindev.gestioncitasmedicas.procedimientos.dto.ReprogramarCitaDTO;
import com.justindev.gestioncitasmedicas.procedimientos.dto.ReprogramarCitaResponseDTO;
import com.justindev.gestioncitasmedicas.procedimientos.repository.IReprogramarCitaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReprogramarCitaService implements IReprogramarCitaService {

    private final IReprogramarCitaRepository reprogramarCitaRepository;

    @Override
    public ReprogramarCitaResponseDTO reprogramarCita(ReprogramarCitaDTO reprogramarCitaDTO) {

        List<Object[]> results = reprogramarCitaRepository.reprogramarCita(
                reprogramarCitaDTO.getIdCita(),
                reprogramarCitaDTO.getNuevaFecha(),
                reprogramarCitaDTO.getNotas()
        );

        if (!results.isEmpty()) {
            Object[] result = results.get(0);
            String mensaje = (String) result[0];
            return new ReprogramarCitaResponseDTO(mensaje);
        }

        return new ReprogramarCitaResponseDTO("Error al reprogramar la cita");
    }
}
