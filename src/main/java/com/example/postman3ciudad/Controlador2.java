package com.example.postman3ciudad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Controlador2 {

    @Autowired
    Servicio servicio;

    @GetMapping("/controlador2/getCiudad")
    public ArrayList devuelvePersona(){
        return servicio.listaCiudades;
    }
}
