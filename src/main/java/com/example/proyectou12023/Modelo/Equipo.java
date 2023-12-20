package com.example.proyectou12023.Modelo;

import lombok.Data;

@Data
public class Equipo {

    private static int contadorId = 1;

    private Integer IdEquipo;
    private String IdPersona;
    private String nombre;

    public Equipo() {
        this.IdEquipo = contadorId++;
    }

}