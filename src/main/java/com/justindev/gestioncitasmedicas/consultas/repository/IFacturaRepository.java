package com.justindev.gestioncitasmedicas.consultas.repository;

import com.justindev.gestioncitasmedicas.consultas.dto.IngresoMensualDTO;
import com.justindev.gestioncitasmedicas.entity.FacturaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IFacturaRepository extends JpaRepository<FacturaEntity, Integer> {

    // 7. Ingresos totales por mes
    @Query(value = "SELECT FORMAT(f.FechaEmision, 'yyyy-MM') as mes, SUM(f.Total) as total " +
            "FROM Facturas f " +
            "GROUP BY FORMAT(f.FechaEmision, 'yyyy-MM') " +
            "ORDER BY mes DESC",
            nativeQuery = true)
    List<IngresoMensualDTO> obtenerIngresosTotalesPorMes();


}
