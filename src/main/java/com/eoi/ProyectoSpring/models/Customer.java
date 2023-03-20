package com.eoi.ProyectoSpring.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String secondName;
    private String thirdName;
    private Date birthDate;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Address> addressSet;

    public Customer(String name, String secondName, String thirdName, Date birthDate) {
        this.name = name;
        this.secondName = secondName;
        this.thirdName = thirdName;
        this.birthDate = birthDate;
    }
}
