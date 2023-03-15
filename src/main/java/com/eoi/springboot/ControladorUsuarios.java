package com.eoi.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController// Y ademas, preparate para recibir peticiones HTTP (REST)
public class ControladorUsuarios {


    @RequestMapping("/")
    String hellow()
    {
        return "Hello World!";
    }


    @RequestMapping("/hola")
    String hola()
    {
        return "Hola World!";
    }



    @RequestMapping("/mimedicacion")
    String miMedicacion()
    {
        return "Tomate las pastillas";
    }
}
