package com.eoi.ProyectoSpring.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class CustomerProductKey implements Serializable {

    @Column(name="customer_id")
    Integer customer_id;

    @Column(name="product_id")
    Integer product_id;

}
