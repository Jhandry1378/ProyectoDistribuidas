package com.example.proyectou12023.Modelo;

public class Resultados {


import lombok.Data;

@Data
public class Resultados {
    private static int contadorId = 1;

    private Integer IdResultados;
    private String Descripcion;

    private String IdMision;

    private String Estado;

}
