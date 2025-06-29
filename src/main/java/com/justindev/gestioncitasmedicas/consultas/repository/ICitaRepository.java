package com.justindev.gestioncitasmedicas.consultas.repository;

import com.justindev.gestioncitasmedicas.consultas.dto.CitaCanceladaDTO;
import com.justindev.gestioncitasmedicas.consultas.dto.CitaPendienteDTO;
import com.justindev.gestioncitasmedicas.consultas.dto.CitasPorEstadoDTO;
import com.justindev.gestioncitasmedicas.consultas.dto.HistorialCitaDTO;
import com.justindev.gestioncitasmedicas.entity.CitaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICitaRepository extends JpaRepository<CitaEntity, Integer> {

    // 1. Citas pendientes para un médico específico (usando JPQL)
    @Query("SELECT new com.justindev.gestioncitasmedicas.consultas.dto.CitaPendienteDTO(" +
            "c.id, CONCAT(p.nombre, ' ', p.apellido), c.fechaCita, c.motivo) " +
            "FROM CitaEntity c " +
            "JOIN c.idPaciente p " +
            "WHERE c.idMedico.id = :idMedico AND c.estado = 'Pendiente' " +
            "ORDER BY c.fechaCita")
    List<CitaPendienteDTO> obtenerCitasPendientesPorMedico(@Param("idMedico") Integer idMedico);

    // 2. Historial de citas de un paciente específico
    @Query("SELECT new com.justindev.gestioncitasmedicas.consultas.dto.HistorialCitaDTO(" +
            "c.id, CONCAT(m.nombre, ' ', m.apellido), m.especialidad, c.fechaCita, c.motivo, c.estado) " +
            "FROM CitaEntity c " +
            "JOIN c.idMedico m " +
            "WHERE c.idPaciente.id = :idPaciente " +
            "ORDER BY c.fechaCita DESC")
    List<HistorialCitaDTO> obtenerHistorialCitasPorPaciente(@Param("idPaciente") Integer idPaciente);

    // 4. Citas por estado (Pendiente, Confirmada, Cancelada)
    @Query("SELECT new com.justindev.gestioncitasmedicas.consultas.dto.CitasPorEstadoDTO(" +
            "c.estado, COUNT(c)) " +
            "FROM CitaEntity c " +
            "GROUP BY c.estado")
    List<CitasPorEstadoDTO> obtenerCitasPorEstado();

    // 8. Citas canceladas y sus motivos
    @Query("SELECT new com.justindev.gestioncitasmedicas.consultas.dto.CitaCanceladaDTO(" +
            "c.id, CONCAT(p.nombre, ' ', p.apellido), CONCAT(m.nombre, ' ', m.apellido), " +
            "c.fechaCita, h.estadoAnterior, h.estadoNuevo, h.notas) " +
            "FROM HistorialCitaEntity h " +
            "JOIN h.idCita c " +
            "JOIN c.idPaciente p " +
            "JOIN c.idMedico m " +
            "WHERE h.estadoNuevo = 'Cancelada' " +
            "ORDER BY c.fechaCita DESC")
    List<CitaCanceladaDTO> obtenerCitasCanceladas();



}
