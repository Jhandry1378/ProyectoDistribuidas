package com.example.proyectou12023.Modelo;

public class Personal {

    private static int contadorId = 1;

    private Integer IdPersonal;
    private String Nombre;
    private String Apellido;
    private Date FechaNacimiento;
    private Integer Edad;
    private String Genero;
    private String IdInstitucion;
    public Personal() {
        this.IdPersonal = contadorId++;
    }

}

