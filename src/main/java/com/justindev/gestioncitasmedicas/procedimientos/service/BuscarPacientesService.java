package com.justindev.gestioncitasmedicas.procedimientos.service;

import com.justindev.gestioncitasmedicas.procedimientos.dto.BuscarPacientesDTO;
import com.justindev.gestioncitasmedicas.procedimientos.repository.IBuscarPacientesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BuscarPacientesService implements IBuscarPacientesService {

    private final IBuscarPacientesRepository buscarPacientesRepository;

    @Override
    public List<BuscarPacientesDTO> buscarPacientes(String nombre, String apellido, String telefono, String email) {

        List<Object[]> results = buscarPacientesRepository.buscarPacientes(nombre, apellido, telefono, email);

        return results.stream().map(result -> new BuscarPacientesDTO(
                (Integer) result[0], // idPaciente
                (String) result[1],  // nombre
                (String) result[2],  // apellido
                (Date) result[3],    // fechaNacimiento
                (String) result[4],  // genero
                (String) result[5],  // telefono
                (String) result[6],  // email
                (String) result[7],  // direccion
                convertToInteger(result[8]) // totalCitas - manejo seguro de tipos
        )).toList();
    }


    private Integer convertToInteger(Object value) {
        if (value instanceof Integer) {
            return (Integer) value;
        } else if (value instanceof BigInteger) {
            return ((BigInteger) value).intValue();
        } else if (value instanceof Long) {
            return ((Long) value).intValue();
        } else if (value == null) {
            return 0;
        }
        return Integer.valueOf(value.toString());
    }
}
