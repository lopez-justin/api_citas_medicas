package com.justindev.gestioncitasmedicas.procedimientos.service;

import com.justindev.gestioncitasmedicas.procedimientos.dto.AgendaMedicoDTO;
import com.justindev.gestioncitasmedicas.procedimientos.repository.IAgendaMedicoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AgendaMedicoService implements IAgendaMedicoService {

    private final IAgendaMedicoRepository agendaMedicoRepository;

    @Override
    public List<AgendaMedicoDTO> obtenerAgendaMedico(Integer idMedico, Date fechaInicio, Date fechaFin) {

        List<Object[]> results = agendaMedicoRepository.obtenerAgendaMedico(idMedico, fechaInicio, fechaFin);

        return results.stream().map(result -> new AgendaMedicoDTO(
                (Integer) result[0], // idCita
                (Date) result[1], // fechaCita
                (String) result[2],  // motivo
                (String) result[3],  // estado
                (String) result[4],  // nombrePaciente
                (String) result[5],  // telefono
                (Integer) result[6]  // edadPaciente
        )).toList();
    }
}
