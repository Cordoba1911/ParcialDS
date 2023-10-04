package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "localidad")
public class Localidad extends Base{
    @Column(name = "denominacion")
    private String denominacion;
}
