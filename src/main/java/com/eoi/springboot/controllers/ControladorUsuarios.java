package com.eoi.springboot.controllers;

import lombok.extern.log4j.Log4j2;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;


/**
 * The type Controlador usuarios.
 */
@RestController

@Log4j2

public class ControladorUsuarios {

    @Value("${mensaje.hola}")
    private String mensajehola;
    @Value("${mensaje.mimedicacion}")
    private String mimedicacion;


    /**
     * Hola string.
     *
     * @return the string
     */
    @GetMapping("${url.hola}")

    String hola() {

        log.warn(mensajehola);

        return mensajehola;

    }


    /**
     * Mi medicacion string.
     *
     * @return the string
     */
    @GetMapping("${url.mimedicacion}")

    String mimedicacion() {

        log.warn(mimedicacion);

        return mimedicacion;

    }



}