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

     //Institucion
    public Institucion guardarInstitucion(Institucion institucion){
        return  repositorio.guardarInstitucion(institucion);
    }
    public List<Institucion> listarInstitucion(){
        return repositorio.listarInstitucion();
    }
    public Institucion busquedaInstitucion(Integer id){
        return repositorio.busquedaInstitucionId(id);
    }
    public Institucion actualizarInstitucion(Integer id, Institucion institucion){
        return repositorio.actualizarInstitucion(id, institucion);
    }
    public List<Institucion> eliminarInstitucion(Integer id){
        return repositorio.eliminarInstitucion(id);
    }

     //Equipo
    public Equipo guardarEquipo(Equipo equipo){
        return  repositorio.guardarEquipo(equipo);
    }
    public List<Equipo> listarEquipo(){
        return repositorio.listarEquipo();
    }
    public Equipo busquedaEquipo(Integer id){
        return repositorio.busquedaEquipoId(id);
    }
    public Equipo actualizarEquipo(Integer id, Equipo equipo){
        return repositorio.actualizarEquipo(id, equipo);
    }
    public List<Equipo> eliminarEquipo(Integer id){
        return repositorio.eliminarEquipo(id);
    }

    //Mision
    public Mision guardarMision(Mision equipo){
        return  repositorio.guardarMision(equipo);
    }
    public List<Mision> listarMision(){
        return repositorio.listarMision();
    }
    public Mision busquedaMision(Integer id){
        return repositorio.busquedaMisionId(id);
    }
    public Mision actualizarMision(Integer id, Mision mision){
        return repositorio.actualizarMision(id, mision);
    }
    public List<Mision> eliminarMision(Integer id){
        return repositorio.eliminarMision(id);
    }

     //Resultados
    public Resultados guardarResultados(Resultados equipo){
        return  repositorio.guardarResultados(equipo);
    }
    public List<Resultados> listarResultados(){
        return repositorio.listarResultados();
    }
    public Resultados busquedaResultados(Integer id){
        return repositorio.busquedaResultadosId(id);
    }
    public Resultados actualizarResultados(Integer id, Resultados resultados){
        return repositorio.actualizarResultados(id, resultados);
    }
    public List<Resultados> eliminarResultados(Integer id){
        return repositorio.eliminarResultados(id);
    }

     //Tareas
    public Tareas guardarTareas(Tareas equipo){
        return  repositorio.guardarTareas(equipo);
    }
    public List<Tareas> listarTareas(){
        return repositorio.listarTareas();
    }
    public Tareas busquedaTareas(Integer id){
        return repositorio.busquedaTareasId(id);
    }
    public Tareas actualizarTareas(Integer id, Tareas tareas){
        return repositorio.actualizarTareas(id, tareas);
    }
    public List<Tareas> eliminarTareas(Integer id){
        return repositorio.eliminarTareas(id);
    }


}
