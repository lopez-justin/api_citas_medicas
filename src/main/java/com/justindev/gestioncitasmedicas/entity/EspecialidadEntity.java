package com.justindev.gestioncitasmedicas.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Especialidad")
public class EspecialidadEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Especialidad", nullable = false)
    private Integer id;

    @Column(name = "Nombre", nullable = false, length = 50)
    private String nombre;

    @Lob
    @Column(name = "Descripcion")
    private String descripcion;

}