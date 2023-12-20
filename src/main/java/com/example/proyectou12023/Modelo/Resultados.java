package com.example.proyectou12023.Modelo;

import lombok.Data;

@Data
public class Resultados {
    private static int contadorId = 1;

    private Integer IdResultados;
    private String Descripcion;

    private String IdMision;

    private String Estado;

    public Resultados() {
        this.IdResultados = contadorId++;
    }
}
