package com.example.proyectou12023.Repositorio;

import com.example.proyectou12023.Modelo.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class Repositorio {
    List<Personal> personallist = new ArrayList<Personal>();
    List<Institucion> institucionlist = new ArrayList<Institucion>();
    List<Equipo> equipolist = new ArrayList<Equipo>();
    List<Mision> misionlist = new ArrayList<Mision>();
    List<Resultados> resultadoslist = new ArrayList<Resultados>();
    List<Tareas> tareaslist = new ArrayList<Tareas>();

    //Personal
    public Personal guardarPersonal(Personal personal){
        try{
            personallist.add(personal);
            return  personal;
        }catch (Exception e){
            return  new Personal();
        }
    }
    public List<Personal> listarPersonal() {
        return personallist;
    }
    public Personal busquedaPersonalId(Integer id){
        for (Personal personal: personallist) {
            if (personal.getIdPersonal().equals(id)){
                return personal;
            } else {
                System.out.println("No se encontro identifacion en la lista" + id + "--" + personal.getIdPersonal());
            }
        }
        return null;
    }
    public Personal actualizarPersonal(Integer id, Personal body){
        Personal aux = busquedaPersonalId(id);
        try{
            if(aux!=null){
                if(body.getNombre()!=null){
                    aux.setNombre(body.getNombre());
                }
                if(body.getApellido()!=null){
                    aux.setApellido(body.getApellido());
                }
                if(body.getEdad()!=null){
                    aux.setEdad(body.getEdad());
                }
                if(body.getFechaNacimiento()!=null){
                    aux.setFechaNacimiento(body.getFechaNacimiento());
                }
                if(body.getGenero()!=null){
                    aux.setGenero(body.getGenero());
                }
                if(body.getIdInstitucion()!=null){
                    aux.setIdInstitucion(body.getIdInstitucion());
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return aux;
    }

    public List<Personal> eliminarPersonal(Integer id_personal) {
        List<Personal> personalEliminados = new ArrayList<>();

        Iterator<Personal> iterator = personallist.iterator();
        while (iterator.hasNext()) {
            Personal personal = iterator.next();
            if (personal.getIdPersonal().equals(id_personal)){
                personalEliminados.add(personal);
                iterator.remove();
            }
        }
        if (!personalEliminados.isEmpty()) {
            System.out.println("Se elimino el personal");
        } else {
            System.out.println("No se encontro el personal");
        }
        return personalEliminados;
    }

    
    //Institucion
    public Institucion guardarInstitucion(Institucion institucion){
        try{
            institucionlist.add(institucion);
            return  institucion;
        }catch (Exception e){
            return  new Institucion();
        }
    }
    public List<Institucion> listarInstitucion() {
        return institucionlist;
    }
    public Institucion busquedaInstitucionId(Integer id){
        for (Institucion institucion: institucionlist) {
            if (institucion.getIdInstitucion().equals(id)){
                return institucion;
            } else {
                System.out.println("No se encontro identifacion en la lista" + id + "--" + institucion.getIdInstitucion());
            }
        }
        return null;
    }
    public Institucion actualizarInstitucion(Integer id, Institucion body){
        Institucion aux = busquedaInstitucionId(id);
        try{
            if(aux!=null){
                if(body.getNombre()!=null){
                    aux.setNombre(body.getNombre());
                }
                if(body.getDireccion()!=null){
                    aux.setDireccion(body.getDireccion());
                }
                if(body.getTelefono()!=null){
                    aux.setTelefono(body.getTelefono());
                }
                if(body.getEmail()!=null){
                    aux.setEmail(body.getEmail());
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return aux;
    }

    public List<Institucion> eliminarInstitucion(Integer id_personal) {
        List<Institucion> institucionEliminados = new ArrayList<>();

        Iterator<Institucion> iterator = institucionlist.iterator();
        while (iterator.hasNext()) {
            Institucion institucion = iterator.next();
            if (institucion.getIdInstitucion().equals(id_personal)){
                institucionEliminados.add(institucion);
                iterator.remove();
            }
        }
        if (!institucionEliminados.isEmpty()) {
            System.out.println("Se elimino la institucion");
        } else {
            System.out.println("No se encontro la institucion");
        }
        return institucionEliminados;
    }

    
}
