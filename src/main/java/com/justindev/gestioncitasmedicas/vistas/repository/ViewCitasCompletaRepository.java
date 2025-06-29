package com.justindev.gestioncitasmedicas.vistas.repository;

import com.justindev.gestioncitasmedicas.vistas.entity.ViewCitasCompletaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ViewCitasCompletaRepository extends JpaRepository<ViewCitasCompletaEntity, Integer> {

    // Uso de la vista citas completas
    @Query(value = "SELECT * FROM VW_CitasCompletas WHERE Id_Cita = :idCita", nativeQuery = true)
    ViewCitasCompletaEntity obtenerCitaCompletaPorId(@Param("idCita") Integer idCita);

    
}
