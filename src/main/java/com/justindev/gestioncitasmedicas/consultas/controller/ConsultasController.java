package com.justindev.gestioncitasmedicas.consultas.controller;

import com.justindev.gestioncitasmedicas.consultas.dto.*;
import com.justindev.gestioncitasmedicas.consultas.service.IConsultasService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("")
@RequiredArgsConstructor
public class ConsultasController {

    private final IConsultasService consultasService;

    @GetMapping("/citas/pendientes/{idMedico}")
    public ResponseEntity<List<CitaPendienteDTO>> getCitasPendientes(@PathVariable Integer idMedico) {
        List<CitaPendienteDTO> citas = consultasService.obtenerCitasPendientesPorMedico(idMedico);
        return ResponseEntity.ok(citas);
    }

    @GetMapping("citas/historial/{idPaciente}")
    public ResponseEntity<List<HistorialCitaDTO>> getHistorialCitas(@PathVariable Integer idPaciente) {
        List<HistorialCitaDTO> historial = consultasService.obtenerHistorialCitasPorPaciente(idPaciente);
        return ResponseEntity.ok(historial);
    }

    @GetMapping("/expedientes/{idPaciente}")
    public ResponseEntity<List<ExpedienteMedicoDTO>> getExpedientesMedicos(@PathVariable Integer idPaciente) {
        List<ExpedienteMedicoDTO> expedientes = consultasService.obtenerExpedientesMedicosPorPaciente(idPaciente);
        return ResponseEntity.ok(expedientes);
    }

    @GetMapping("/citas-por-estado")
    public ResponseEntity<List<CitasPorEstadoDTO>> getCitasPorEstado() {
        List<CitasPorEstadoDTO> citasPorEstado = consultasService.obtenerCitasPorEstado();
        return ResponseEntity.ok(citasPorEstado);
    }

    @GetMapping("/pacientes/sin-citas-recientes")
    public ResponseEntity<List<PacientesSinCitasRecientesDTO>> getPacientesSinCitasRecientes() {
        Instant fechaLimite = LocalDateTime.now().minusMonths(6).toInstant(java.time.ZoneOffset.UTC);
        List<PacientesSinCitasRecientesDTO> pacientes = consultasService.obtenerPacientesSinCitasRecientes(fechaLimite);
        return ResponseEntity.ok(pacientes);
    }

    @GetMapping("/medicos/especialidades")
    public ResponseEntity<List<MedicoEspecialidadDTO>> getMedicosConEspecialidades() {
        List<MedicoEspecialidadDTO> medicos = consultasService.obtenerMedicosConEspecialidades();
        return ResponseEntity.ok(medicos);
    }

    @GetMapping("/ingresos-mensuales")
    public ResponseEntity<List<IngresoMensualDTO>> obtenerIngresosMensuales() {
        List<IngresoMensualDTO> ingresos = consultasService.obtenerIngresosTotalesPorMes();
        return ResponseEntity.ok(ingresos);
    }

    @GetMapping("/citas/canceladas")
    public ResponseEntity<List<CitaCanceladaDTO>> getCitasCanceladas() {
        List<CitaCanceladaDTO> citasCanceladas = consultasService.obtenerCitasCanceladas();
        return ResponseEntity.ok(citasCanceladas);
    }

}
