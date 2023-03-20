package com.eoi.ProyectoSpring.controllers;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Controlador cursos.
 */
@RestController
@Log4j2
@RequestMapping("${url.address}")
public class AddressController {
    @GetMapping("/all")
    String list() {
        return null;
    }


}


