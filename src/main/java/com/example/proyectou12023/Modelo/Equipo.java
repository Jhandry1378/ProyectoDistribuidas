package com.example.proyectou12023.Modelo;

public class Equipo {
    private static int contadorId = 1;

    private Integer IdEquipo;
    private Integer IdPersona;
    public Equipo() {
        this.IdEquipo = contadorId++;
    }

}
