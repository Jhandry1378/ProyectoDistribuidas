package com.example.proyectou12023.Modelo;

import lombok.Data;

@Data
public class Mision {

    private Integer IdMision;
    private String Nombre;
    private String Descripcion;

    private String IdEquipo;

    private String Estado;

    public Mision() {
        this.IdMision = contadorId++;
    }
}
