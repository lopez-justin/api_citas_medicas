package com.justindev.gestioncitasmedicas.procedimientos.controller;

import com.justindev.gestioncitasmedicas.procedimientos.dto.AgendaMedicoDTO;
import com.justindev.gestioncitasmedicas.procedimientos.service.IAgendaMedicoService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("")
@RequiredArgsConstructor
public class ProcedimientosController {

    private final IAgendaMedicoService agendaMedicoService;


    @GetMapping("/medico/{idMedico}/agenda")
    public ResponseEntity<List<AgendaMedicoDTO>> obtenerAgendaMedico(
            @PathVariable Integer idMedico,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date fechaInicio,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date fechaFin) {

        List<AgendaMedicoDTO> agenda = agendaMedicoService.obtenerAgendaMedico(idMedico, fechaInicio, fechaFin);
        return ResponseEntity.ok(agenda);

    }
}
