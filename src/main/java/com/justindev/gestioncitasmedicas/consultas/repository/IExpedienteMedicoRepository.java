package com.justindev.gestioncitasmedicas.consultas.repository;

import com.justindev.gestioncitasmedicas.consultas.dto.ExpedienteMedicoDTO;
import com.justindev.gestioncitasmedicas.entity.ExpedientesMedicoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IExpedienteMedicoRepository extends JpaRepository<ExpedientesMedicoEntity, Integer> {

    // 3. Obtener expedientes médicos por paciente específico
    @Query("SELECT new com.justindev.gestioncitasmedicas.consultas.dto.ExpedienteMedicoDTO(" +
            "e.id, e.fechaConsulta, CONCAT(m.nombre, ' ', m.apellido), m.especialidad, e.diagnostico, e.tratamiento) " +
            "FROM ExpedientesMedicoEntity e " +
            "JOIN e.idMedico m " +
            "WHERE e.idPaciente.id = :idPaciente " +
            "ORDER BY e.fechaConsulta DESC")
    List<ExpedienteMedicoDTO> obtenerExpedientesPorPaciente(Integer idPaciente);

}
