package com.example.proyectou12023.Modelo;

public class Tareas {
    private static int contadorId = 1;

    private Integer IdTareas;
    private String Descripcion;

    private Integer IdMision;

    public Tareas() {
        this.IdTareas = contadorId++;
    }
}
