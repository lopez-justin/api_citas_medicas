package com.justindev.gestioncitasmedicas.procedimientos.repository;

import com.justindev.gestioncitasmedicas.procedimientos.entity.BuscarPacientesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBuscarPacientesRepository extends JpaRepository<BuscarPacientesEntity, Integer> {

    @Query(value = "EXEC SP_BuscarPacientes :nombre, :apellido, :telefono, :email", nativeQuery = true)
    List<Object[]> buscarPacientes(
            @Param("nombre") String nombre,
            @Param("apellido") String apellido,
            @Param("telefono") String telefono,
            @Param("email") String email
    );
}
