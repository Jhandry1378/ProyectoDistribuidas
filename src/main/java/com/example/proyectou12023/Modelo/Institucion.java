package com.example.proyectou12023.Modelo;

import lombok.Data;

import java.util.Date;
@Data
public class Institucion {
    private static int contadorId = 1;

    private Integer IdInstitucion;
    private String Nombre;
    private String Direccion;
    private String Telefono;
    private String Email;
    public Institucion() {
        this.IdInstitucion = contadorId++;
    }

}
