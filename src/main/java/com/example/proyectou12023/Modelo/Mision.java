package com.example.proyectou12023.Modelo;

public class Mision {
    private static int contadorId = 1;

    private Integer IdMision;
    private String Nombre;
    private String Descripcion;

    private Integer IdEquipo;

    private String Estado;

    public Mision() {
        this.IdMision = contadorId++;
    }
}
