package com.eoi.ProyectoSpring.services;

import com.eoi.ProyectoSpring.models.Customer;
import com.eoi.ProyectoSpring.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Optional;


@Service
public class CustomerService implements CustomerServiceInterface {

    @Autowired
    CustomerRepository customerRepository;


    @Override
    public ArrayList<Customer> findAllCustomer() {
        return (ArrayList<Customer>) customerRepository.findAll();
    }

    @Override
    public Customer findByID(Integer id) {
        Optional<Customer> opt = customerRepository.findById(id);
        if (opt.isPresent())
            return opt.get();
        else
            return null;
    }


    @Override
    public void addCustomer() {

        Customer customer = new Customer("Alejandro","Kerman","The First", Date.valueOf(LocalDate.of( 1982 , 5 , 9 )));
        customerRepository.save(customer);

    }

    @Override
    public void deleteAllData() {
        customerRepository.deleteAll();
    }
}
