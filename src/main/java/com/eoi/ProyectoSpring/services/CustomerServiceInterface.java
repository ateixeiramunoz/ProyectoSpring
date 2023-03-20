package com.eoi.ProyectoSpring.services;

import com.eoi.ProyectoSpring.models.Customer;

import java.util.ArrayList;

public interface CustomerServiceInterface {
    ArrayList<Customer> findAllCustomer();
    Customer findByID(Integer id);
    void addCustomer();
    void deleteAllData();
}
