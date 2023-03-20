package com.eoi.ProyectoSpring.models;


import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Product {

    @Id
    private Integer id;
    @Column(nullable = false,unique=true)
    private String name;
    @Column(nullable = false)
    private String description;

}
