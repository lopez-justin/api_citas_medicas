package com.justindev.gestioncitasmedicas.procedimientos.controller;

import com.justindev.gestioncitasmedicas.procedimientos.dto.ReprogramarCitaDTO;
import com.justindev.gestioncitasmedicas.procedimientos.dto.ReprogramarCitaResponseDTO;
import com.justindev.gestioncitasmedicas.procedimientos.service.IReprogramarCitaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping()
@RequiredArgsConstructor
public class ReprogramarCitaController {

    private final IReprogramarCitaService reprogramarCitaService;

    @PutMapping("/citas/reprogramar")
    public ResponseEntity<ReprogramarCitaResponseDTO> reprogramarCita(@RequestBody ReprogramarCitaDTO reprogramarCitaDTO) {
        try {
            ReprogramarCitaResponseDTO response = reprogramarCitaService.reprogramarCita(reprogramarCitaDTO);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            ReprogramarCitaResponseDTO errorResponse = new ReprogramarCitaResponseDTO("Error: " + e.getMessage());
            return ResponseEntity.badRequest().body(errorResponse);
        }
    }
}
