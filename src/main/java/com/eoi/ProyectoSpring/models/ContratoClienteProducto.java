package com.eoi.ProyectoSpring.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class ContratoClienteProducto {

    @Id
    Integer id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    Customer customer;

    @ManyToOne
    @JoinColumn(name = "product_id")
    Product product;

    Date dateStart;
    Date dateEnd;

}