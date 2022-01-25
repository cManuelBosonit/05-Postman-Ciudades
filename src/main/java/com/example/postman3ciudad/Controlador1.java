package com.example.postman3ciudad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador1 {

    @Autowired
    Servicio servicio;

    @PostMapping("controlador1/addCiudad")
    public void addCiudad(@RequestHeader (value="nombre") String nombre,
                          @RequestHeader (value="habitantes") int habitantes){
        servicio.creaCiudad(nombre, habitantes);
    }
}
