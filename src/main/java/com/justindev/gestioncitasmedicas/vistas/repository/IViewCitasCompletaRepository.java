package com.justindev.gestioncitasmedicas.vistas.repository;

import com.justindev.gestioncitasmedicas.vistas.entity.ViewCitasCompletasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IViewCitasCompletaRepository extends JpaRepository<ViewCitasCompletasEntity, Integer> {

    // Uso de la vista citas completas
    ViewCitasCompletasEntity findByIdCita(@Param("idCita") Integer idCita);
    
}
