package edu.utn.model;

import java.time.LocalDate;
import java.util.*;

public class Materia {
    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaFinal;
    private Set<Alumno> alumnos = new HashSet<>();

    public Materia() {}

    public Materia(String nombre, LocalDate fechaInicio, LocalDate fechaFinal) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public Set<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }
    @Override
    public String toString() {
        return "Materia{" +
                "nombre='" + nombre + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", fechaFinal=" + fechaFinal +
                ", alumnos=" + alumnos +
                '}';
    }
}
