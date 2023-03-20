package com.eoi.ProyectoSpring.controllers;
import com.eoi.ProyectoSpring.models.Customer;
import com.eoi.ProyectoSpring.services.CustomerService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


/**
     * The type Controlador cursos.
     */
    @RestController
    @Log4j2
    @RequestMapping("${url.customer}")
    public class CustomerController {

        @Autowired
        CustomerService customerService;

        @GetMapping("/all")
        ArrayList<Customer> list() {
            return customerService.findAllCustomer();
        }

        @GetMapping("/add")
        String add() {
            customerService.addCustomer();
            return null;
        }



    }


