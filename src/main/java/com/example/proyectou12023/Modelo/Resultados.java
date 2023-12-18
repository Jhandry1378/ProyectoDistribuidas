package com.example.proyectou12023.Modelo;

public class Resultados {
    private static int contadorId = 1;

    private Integer IdResultados;
    private String Descripcion;

    private Integer IdMision;

    private String Estado;

    public Resultados() {
        this.IdResultados = contadorId++;
    }
}
