package com.justindev.gestioncitasmedicas.consultas.service;

import com.justindev.gestioncitasmedicas.consultas.dto.*;
import com.justindev.gestioncitasmedicas.consultas.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ConsultasService implements IConsultasService {

    private final ICitaRepository citaRepository;
    private final IFacturaRepository facturaRepository;
    private final IExpedienteMedicoRepository expedienteMedicoRepository;
    private final IPacienteRepository pacienteRepository;
    private final IMedicoRepository medicoRepository;


    // 1. Citas pendientes por médico específico
    @Override
    public List<CitaPendienteDTO> obtenerCitasPendientesPorMedico(Integer idMedico) {
        return this.citaRepository.obtenerCitasPendientesPorMedico(idMedico);
    }

    // 2. Historial de citas por paciente específico
    @Override
    public List<HistorialCitaDTO> obtenerHistorialCitasPorPaciente(Integer idPaciente) {
        return this.citaRepository.obtenerHistorialCitasPorPaciente(idPaciente);
    }

    // 3. Expedientes médicos por paciente específico
    @Override
    public List<ExpedienteMedicoDTO> obtenerExpedientesMedicosPorPaciente(Integer idPaciente) {
        return this.expedienteMedicoRepository.obtenerExpedientesPorPaciente(idPaciente);
    }

    // 4. Citas por estado (pendientes, confirmadas, canceladas)
    @Override
    public List<CitasPorEstadoDTO> obtenerCitasPorEstado() {
        return this.citaRepository.obtenerCitasPorEstado();
    }

    // 5. Pacientes sin citas recientes
    @Override
    public List<PacientesSinCitasRecientesDTO> obtenerPacientesSinCitasRecientes(Instant fechaLimite) {
        return this.pacienteRepository.obtenerPacientesSinCitasRecientes(fechaLimite);
    }

    // 6. Médicos con especialidades
    @Override
    public List<MedicoEspecialidadDTO> obtenerMedicosConEspecialidades() {
        return this.medicoRepository.obtenerMedicosConEspecialidades();
    }

    // 7. Ingresos totales por mes
    @Override
    public List<IngresoMensualDTO> obtenerIngresosTotalesPorMes() {
        return this.facturaRepository.obtenerIngresosTotalesPorMes();
    }

    // 8. Citas canceladas y sus motivos
    @Override
    public List<CitaCanceladaDTO> obtenerCitasCanceladas() {
        return this.citaRepository.obtenerCitasCanceladas();
    }

}
