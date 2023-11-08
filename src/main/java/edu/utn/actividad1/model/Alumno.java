package edu.utn.actividad1.model;

import java.time.LocalDate;
import java.util.*;

public class Alumno {
    private String apellido;
    private String nombre;


    private Set<Materia> materias = new HashSet<>();

    //constructores
    public Alumno() {}

    public Alumno(String apellido, String nombre) {
        this.apellido = apellido;
        this.nombre = nombre;
    }

    //getters setters
    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }



    public Set<Materia> getMaterias() {
        return materias;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    @Override
    public String toString() {
        return "Alumno{"+'\'' +
                "apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                ", materias=" + materias +
                '}';
    }
}
