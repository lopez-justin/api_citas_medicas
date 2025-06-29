package com.justindev.gestioncitasmedicas.consultas.repository;

import com.justindev.gestioncitasmedicas.consultas.dto.MedicoEspecialidadDTO;
import com.justindev.gestioncitasmedicas.entity.MedicoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IMedicoRepository extends JpaRepository<MedicoEntity, Integer> {

    // 6. Médicos y sus especialidades
    @Query("SELECT new com.justindev.gestioncitasmedicas.consultas.dto.MedicoEspecialidadDTO(" +
            "m.id, CONCAT(m.nombre, ' ', m.apellido), e.nombre) " +
            "FROM MedicoEntity m " +
            "JOIN m.especialidadesMedicos em " +
            "JOIN em.idEspecialidad e ")
    List<MedicoEspecialidadDTO> obtenerMedicosConEspecialidades();


}
