package com.justindev.gestioncitasmedicas.procedimientos.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter @Getter
@NoArgsConstructor @AllArgsConstructor
public class ReprogramarCitaEntity {

    @Id
    private String mensaje;

}
