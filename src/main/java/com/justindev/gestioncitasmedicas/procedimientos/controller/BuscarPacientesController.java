package com.justindev.gestioncitasmedicas.procedimientos.controller;

import com.justindev.gestioncitasmedicas.procedimientos.dto.BuscarPacientesDTO;
import com.justindev.gestioncitasmedicas.procedimientos.service.IBuscarPacientesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping()
@RequiredArgsConstructor
public class BuscarPacientesController {

    private final IBuscarPacientesService buscarPacientesService;


    @GetMapping("/pacientes/buscar")
    public ResponseEntity<List<BuscarPacientesDTO>> buscarPacientesPor(
            @RequestParam(required = false) String nombre,
            @RequestParam(required = false) String apellido,
            @RequestParam(required = false) String telefono,
            @RequestParam(required = false) String email) {
        List<BuscarPacientesDTO> pacientes = buscarPacientesService.buscarPacientes(
                nombre,
                apellido,
                telefono,
                email
        );

        return ResponseEntity.ok(pacientes);

    }
}
