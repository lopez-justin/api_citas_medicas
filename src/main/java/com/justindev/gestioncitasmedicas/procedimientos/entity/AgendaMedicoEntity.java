package com.justindev.gestioncitasmedicas.procedimientos.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Setter @Getter
@NoArgsConstructor @AllArgsConstructor
public class AgendaMedicoEntity {

    @Id
    private Integer idCita;

    private Date fechaCita;

    private String motivo;

    private String estado;

    private String nombrePaciente;

    private String telefono;

    private Integer edadPaciente;
}
