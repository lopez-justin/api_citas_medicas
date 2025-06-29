package com.justindev.gestioncitasmedicas.procedimientos.repository;

import com.justindev.gestioncitasmedicas.procedimientos.entity.ReprogramarCitaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface IReprogramarCitaRepository extends JpaRepository<ReprogramarCitaEntity, Integer> {

    @Query(value = "EXEC SP_ReprogramarCita :idCita, :nuevaFecha, :notas", nativeQuery = true)
    List<Object[]> reprogramarCita(
            @Param("idCita") Integer idCita,
            @Param("nuevaFecha") Date nuevaFecha,
            @Param("notas") String notas
    );
}
