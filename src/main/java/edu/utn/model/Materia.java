package edu.utn.model;

import java.time.LocalDate;
import java.util.*;

public class Materia {
    private String nombre;
    private Set<Alumno> alumnos = new HashSet<>();
    private Set<Materia> correlativas = new HashSet<>();

    public Materia() {}

    public Materia(String nombre) {
        this.nombre = nombre;
    }

    public Materia(String nombre, Set<Materia> correlativas) {
        this.nombre = nombre;
        this.correlativas = correlativas;
    }

    public String getNombre() {
        return nombre;
    }

    public Set<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    @Override
    public String toString() {
        return "Materia{" +
                "nombre='" + nombre + '\'' +
                ", alumnos=" + alumnos +
                ", correlativas=" + correlativas +
                '}';
    }
}
