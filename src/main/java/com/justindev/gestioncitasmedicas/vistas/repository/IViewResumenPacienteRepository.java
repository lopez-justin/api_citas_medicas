package com.justindev.gestioncitasmedicas.vistas.repository;

import com.justindev.gestioncitasmedicas.vistas.entity.ViewResumenPacienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IViewResumenPacienteRepository extends JpaRepository<ViewResumenPacienteEntity, Integer> {

    ViewResumenPacienteEntity findByIdPaciente(Integer idPaciente);

}
