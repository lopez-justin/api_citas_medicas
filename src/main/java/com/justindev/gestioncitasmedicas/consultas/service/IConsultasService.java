package com.justindev.gestioncitasmedicas.consultas.service;

import com.justindev.gestioncitasmedicas.consultas.dto.*;

import java.time.Instant;
import java.util.List;

public interface IConsultasService {

    List<CitaPendienteDTO> obtenerCitasPendientesPorMedico(Integer idMedico);

    List<HistorialCitaDTO> obtenerHistorialCitasPorPaciente(Integer idPaciente);

    List<ExpedienteMedicoDTO> obtenerExpedientesMedicosPorPaciente(Integer idPaciente);

    List<CitasPorEstadoDTO> obtenerCitasPorEstado();

    List<PacientesSinCitasRecientesDTO> obtenerPacientesSinCitasRecientes(Instant fechaLimite);

    List<MedicoEspecialidadDTO> obtenerMedicosConEspecialidades();

    List<IngresoMensualDTO> obtenerIngresosTotalesPorMes();

    List<CitaCanceladaDTO> obtenerCitasCanceladas();

}
