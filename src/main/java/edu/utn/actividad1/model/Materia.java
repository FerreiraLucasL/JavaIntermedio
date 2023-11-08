package edu.utn.actividad1.model;

import java.util.*;

public class Materia {
    private String nombre;
    private int nivel;
    private Set<Materia> correlativas = new HashSet<>();

    public Materia() {}

    public Materia(String nombre, int nivel){
        this.nombre = nombre;
        this.nivel=nivel;
    }

    public Materia(String nombre, int nivel ,Set<Materia> correlativas) {
        this.nombre = nombre;
        this.nivel=nivel;
        this.correlativas = correlativas;
    }

    public String getNombre() {
        return nombre;
    }


    public int getNivel() {
        return nivel;
    }

    public Set<Materia> getCorrelativas() {
        return correlativas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    @Override
    public String toString() {
        return "Materia{" +
                "nombre='" + nombre + '\'' +
                "nivel ='" + nivel +
                '}';
    }
}
