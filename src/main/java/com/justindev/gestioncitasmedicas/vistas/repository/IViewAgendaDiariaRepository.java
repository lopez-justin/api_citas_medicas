package com.justindev.gestioncitasmedicas.vistas.repository;

import com.justindev.gestioncitasmedicas.vistas.entity.ViewAgendaDiariaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IViewAgendaDiariaRepository extends JpaRepository<ViewAgendaDiariaEntity, Integer> {

    // Vista de agenda diaria para medicos
    ViewAgendaDiariaEntity findByIdMedico(Integer idMedico);

}
