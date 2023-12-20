package com.example.proyectou12023.Servicios;

import com.example.proyectou12023.Modelo.*;
import com.example.proyectou12023.Repositorio.Repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Servicios {

 @Autowired
    Repositorio repositorio;

    //Personal
    public Personal guardarPersonal(Personal personal){
        return  repositorio.guardarPersonal(personal);
    }
    public List<Personal> listarPersonal(){
        return repositorio.listarPersonal();
    }
    public Personal busquedaPersonal(Integer id){
        return repositorio.busquedaPersonalId(id);
    }
    public Personal actualizarPersonal(Integer id, Personal personal){

        return repositorio.actualizarPersonal(id, personal);
    }
    public List<Personal> eliminarPersonal(Integer id){
        return repositorio.eliminarPersonal(id);
    }

}
