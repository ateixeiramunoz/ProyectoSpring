package com.eoi.ProyectoSpring.controllers;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;


    /**
     * The type Controlador cursos.
     */
    @RestController
    @Log4j2
    @RequestMapping("${url.customer}")
    public class CustomerController {
        @GetMapping("/all")
        String list() {
            return null;
        }
        

    }


