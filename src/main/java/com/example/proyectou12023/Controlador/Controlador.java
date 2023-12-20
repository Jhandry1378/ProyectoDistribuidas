package com.example.proyectou12023.Controlador;

import com.example.proyectou12023.Modelo.*;
import com.example.proyectou12023.Servicios.Servicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class Controlador {
    @Autowired
    public Servicios servicio;

    //Personal
    @PostMapping("/GuardarPersonal")
    public Personal guardarPersonal(@RequestBody Personal personal){
        return servicio.guardarPersonal(personal);
    }

    @GetMapping("/listarPersonal")
    public List<Personal> listarPersonal(){
        return servicio.listarPersonal();
    }

    @GetMapping("/busquedaPersonal/{id}")
    public Personal busquedaPersonalId(@PathVariable Integer id){
        return servicio.busquedaPersonal(id);
    }

    @PutMapping("/editarPersonal/{id}")
    public Personal actualizarPersonal(@PathVariable Integer id, @RequestBody Personal personal){
        return servicio.actualizarPersonal(id, personal);
    }
    @DeleteMapping("/eliminarPersonal/{id}")
    public List<Personal> eliminarPersonal(@PathVariable Integer id){
        return servicio.eliminarPersonal(id);
    }


    //Institucion
    @PostMapping("/GuardarInstitucion")
    public Institucion guardarInstitucion(@RequestBody Institucion institucion){
        return servicio.guardarInstitucion(institucion);
    }

    @GetMapping("/listarInstitucion")
    public List<Institucion> listarInstitucion(){
        return servicio.listarInstitucion();
    }

    @GetMapping("/busquedaInstitucion/{id}")
    public Institucion busquedaInstitucionId(@PathVariable Integer id){
        return servicio.busquedaInstitucion(id);
    }
    @PutMapping("/editarInstitucion/{id}")
    public Institucion actualizarInstitucion(@PathVariable Integer id, @RequestBody Institucion institucion){
        return servicio.actualizarInstitucion(id, institucion);
    }
    @DeleteMapping("/eliminarInstitucion/{id}")
    public List<Institucion> eliminarInstitucion(@PathVariable Integer id){
        return servicio.eliminarInstitucion(id);
    }

    //Equipo
    @PostMapping("/GuardarEquipo")
    public Equipo guardarEquipo(@RequestBody Equipo equipo){
        return servicio.guardarEquipo(equipo);
    }

    @GetMapping("/listarEquipo")
    public List<Equipo> listarEquipo(){
        return servicio.listarEquipo();
    }

    @GetMapping("/busquedaEquipo/{id}")
    public Equipo busquedaEquipoId(@PathVariable Integer id){
        return servicio.busquedaEquipo(id);
    }
    @PutMapping("/editarEquipo/{id}")
    public Equipo actualizarEquipo(@PathVariable Integer id, @RequestBody Equipo equipo){
        return servicio.actualizarEquipo(id, equipo);
    }
    @DeleteMapping("/eliminarEquipo/{id}")
    public List<Equipo> eliminarEquipo(@PathVariable Integer id){
        return servicio.eliminarEquipo(id);
    }

    //Mision
    @PostMapping("/GuardarMision")
    public Mision guardarEquipo(@RequestBody Mision mision){
        return servicio.guardarMision(mision);
    }
    @GetMapping("/listarMision")
    public List<Mision> listarMision(){
        return servicio.listarMision();
    }
    @GetMapping("/busquedaMision/{id}")
    public Mision busquedaMisionId(@PathVariable Integer id){
        return servicio.busquedaMision(id);
    }
    @PutMapping("/editarMision/{id}")
    public Mision actualizarMision(@PathVariable Integer id, @RequestBody Mision mision){
        return servicio.actualizarMision(id, mision);
    }
    @DeleteMapping("/eliminarMision/{id}")
    public List<Mision> eliminarMision(@PathVariable Integer id){
        return servicio.eliminarMision(id);
    }

    //Resultados
    @PostMapping("/GuardarResultados")
    public Resultados guardarResultados(@RequestBody Resultados resultados){
        return servicio.guardarResultados(resultados);
    }

    @GetMapping("/listarResultados")
    public List<Resultados> listarResultados(){
        return servicio.listarResultados();
    }

    @GetMapping("/busquedaResultados/{id}")
    public Resultados busquedaResultadosId(@PathVariable Integer id){
        return servicio.busquedaResultados(id);
    }
    @PutMapping("/editarResultados/{id}")
    public Resultados actualizarResultados(@PathVariable Integer id, @RequestBody Resultados resultados){
        return servicio.actualizarResultados(id, resultados);
    }
    @DeleteMapping("/eliminarResultados/{id}")
    public List<Resultados> eliminarResultados(@PathVariable Integer id){
        return servicio.eliminarResultados(id);
    }

    //Tareas
    @PostMapping("/GuardarTareas")
    public Tareas guardarTareas(@RequestBody Tareas tareas){
        return servicio.guardarTareas(tareas);
    }
    @GetMapping("/listarTareas")
    public List<Tareas> listarTareas(){
        return servicio.listarTareas();
    }

    @GetMapping("/busquedaTareas/{id}")
    public Tareas busquedaTareasId(@PathVariable Integer id){
        return servicio.busquedaTareas(id);
    }
    @PutMapping("/editarTareas/{id}")
    public Tareas actualizarTareas(@PathVariable Integer id, @RequestBody Tareas tareas){
        return servicio.actualizarTareas(id, tareas);
    }
    @DeleteMapping("/eliminarTareas/{id}")
    public List<Tareas> eliminarTareas(@PathVariable Integer id){
        return servicio.eliminarTareas(id);
    }

}
