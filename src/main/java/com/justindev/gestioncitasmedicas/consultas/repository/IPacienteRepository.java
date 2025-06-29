package com.justindev.gestioncitasmedicas.consultas.repository;

import com.justindev.gestioncitasmedicas.consultas.dto.PacientesSinCitasRecientesDTO;
import com.justindev.gestioncitasmedicas.entity.PacienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface IPacienteRepository extends JpaRepository<PacienteEntity, Integer> {

    // 5. Pacientes que no han tenido citas en los últimos 6 meses¡
    @Query("SELECT new com.justindev.gestioncitasmedicas.consultas.dto.PacientesSinCitasRecientesDTO(" +
            "p.id, p.nombre, p.apellido, p.telefono, MAX(c.fechaCita)) " +
            "FROM PacienteEntity p " +
            "LEFT JOIN p.citas c " +
            "GROUP BY p.id, p.nombre, p.apellido, p.telefono " +
            "HAVING MAX(c.fechaCita) < :fechaLimite OR MAX(c.fechaCita) IS NULL " +
            "ORDER BY MAX(c.fechaCita) ASC")
    List<PacientesSinCitasRecientesDTO> obtenerPacientesSinCitasRecientes(@Param("fechaLimite") Instant fechaLimite);


}
