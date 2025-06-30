package com.justindev.gestioncitasmedicas.vistas.controller;

import com.justindev.gestioncitasmedicas.vistas.entity.ViewAgendaDiariaEntity;
import com.justindev.gestioncitasmedicas.vistas.entity.ViewCitasCompletasEntity;
import com.justindev.gestioncitasmedicas.vistas.entity.ViewExpedientesCompletoEntity;
import com.justindev.gestioncitasmedicas.vistas.entity.ViewResumenPacienteEntity;
import com.justindev.gestioncitasmedicas.vistas.service.IViewAgendaDiariaService;
import com.justindev.gestioncitasmedicas.vistas.service.IViewCitasCompletaService;
import com.justindev.gestioncitasmedicas.vistas.service.IViewExpedientesCompletoService;
import com.justindev.gestioncitasmedicas.vistas.service.IViewResumenPacienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
@RequiredArgsConstructor
public class VistasController {

    private final IViewCitasCompletaService viewCitasCompletaService;
    private final IViewAgendaDiariaService viewAgendaDiariaService;
    private final IViewExpedientesCompletoService viewExpedientesCompletoService;
    private final IViewResumenPacienteService viewResumenPacienteService;

    @GetMapping("/citas/full/{idCita}")
    public ResponseEntity<ViewCitasCompletasEntity> getCitaCompleta(@PathVariable Integer idCita) {
        ViewCitasCompletasEntity citaCompleta = viewCitasCompletaService.obtenerCitaCompletaPorId(idCita);
        return ResponseEntity.ok(citaCompleta);
    }

    @GetMapping("/expedientes/full/{idExpediente}")
    public ResponseEntity<ViewExpedientesCompletoEntity> getExpedienteCompleto(@PathVariable Integer idExpediente) {
        ViewExpedientesCompletoEntity expedienteCompleto = viewExpedientesCompletoService.obtenerExpedienteCompletoPorId(idExpediente);
        return ResponseEntity.ok(expedienteCompleto);
    }

    @GetMapping("/pacientes/{idPaciente}/resumen")
    public ResponseEntity<ViewResumenPacienteEntity> getResumenPaciente(@PathVariable Integer idPaciente) {
        ViewResumenPacienteEntity resumenPaciente = viewResumenPacienteService.obtenerResumenPacientePorId(idPaciente);
        return ResponseEntity.ok(resumenPaciente);
    }

    @GetMapping("/medicos/{idMedico}/agenda-diaria")
    public ResponseEntity<ViewAgendaDiariaEntity> getAgendaDiariaPorMedico(@PathVariable Integer idMedico) {
        ViewAgendaDiariaEntity agendaDiaria = viewAgendaDiariaService.obtenerAgendaDiariaPorMedico(idMedico);
        return ResponseEntity.ok(agendaDiaria);
    }

}
