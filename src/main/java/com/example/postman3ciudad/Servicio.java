package com.example.postman3ciudad;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class Servicio {
    ArrayList<Ciudad> listaCiudades = new ArrayList<Ciudad>();
    Ciudad ciudad;

    //Recibe los datos del controlador y se meten en una lista
    public void creaCiudad(String nombre, int numeroHabitantes){
        ciudad = new Ciudad();
        ciudad.setNombre(nombre);
        ciudad.setNumeroHabitantes(numeroHabitantes);
        listaCiudades.add(ciudad);
    }

    public ArrayList getCiudades(){
        return listaCiudades;
    }
}
