package com.justindev.gestioncitasmedicas.procedimientos.controller;

import com.justindev.gestioncitasmedicas.procedimientos.dto.ReprogramarCitaDTO;
import com.justindev.gestioncitasmedicas.procedimientos.service.IReprogramarCitaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
@RequiredArgsConstructor
public class ReprogramarCitaController {

    private final IReprogramarCitaService reprogramarCitaService;

    @PutMapping("/citas/reprogramar")
    public ResponseEntity<String> reprogramarCita(@RequestBody ReprogramarCitaDTO reprogramarCitaDTO) {
        try {
            String response = reprogramarCitaService.reprogramarCita(reprogramarCitaDTO);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error: " + e.getMessage());
        }
    }
}
