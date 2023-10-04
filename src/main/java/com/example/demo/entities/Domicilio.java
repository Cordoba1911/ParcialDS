package com.example.demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "domicilio")
public class Domicilio extends Base {
    @Column(name = "calle")
    private String calle;
    @Column(name = "numero")
    private int numero;
    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_localidad")
    private Localidad localidad;
}
