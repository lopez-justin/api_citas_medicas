package com.justindev.gestioncitasmedicas.procedimientos.repository;

import com.justindev.gestioncitasmedicas.procedimientos.entity.AgendaMedicoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface IAgendaMedicoRepository extends JpaRepository<AgendaMedicoEntity, Integer> {

    @Query(value = "EXEC SP_ObtenerAgendaMedico :idMedico, :fechaInicio, :fechaFin", nativeQuery = true)
    List<Object[]> obtenerAgendaMedico(
            @Param("idMedico") Integer idMedico,
            @Param("fechaInicio") Date fechaInicio,
            @Param("fechaFin") Date fechaFin
    );

}
