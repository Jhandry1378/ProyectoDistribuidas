package com.example.proyectou12023.Modelo;

import lombok.Data;

@Data
public class Tareas {

    private Integer IdTareas;
    private String Descripcion;

    private String IdMision;

    public Tareas() {
        this.IdTareas = contadorId++;
    }

}
