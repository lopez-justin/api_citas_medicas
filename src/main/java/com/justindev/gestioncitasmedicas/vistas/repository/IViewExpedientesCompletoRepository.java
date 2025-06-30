package com.justindev.gestioncitasmedicas.vistas.repository;

import com.justindev.gestioncitasmedicas.vistas.entity.ViewExpedientesCompletoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IViewExpedientesCompletoRepository extends JpaRepository<ViewExpedientesCompletoEntity, Integer> {

    // Vista de expedientes completos
    ViewExpedientesCompletoEntity findByIdExpediente(Integer idExpediente);

}
