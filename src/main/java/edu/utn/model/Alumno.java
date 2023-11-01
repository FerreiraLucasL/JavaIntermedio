package edu.utn.model;

import java.time.LocalDate;
import java.util.*;

public class Alumno {
    private String apellido;
    private String nombre;
    private String dni;
    private LocalDate fechaNac;
    private int edad;

    private Set<Materia> materias = new HashSet<>();

    //constructores
    public Alumno() {}

    public Alumno(String apellido, String nombre, String dni, LocalDate fechaNac) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNac = fechaNac;
        this.edad = fechaNac.compareTo(LocalDate.now());
    }

    //getters setters
    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public int getEdad() {
        return edad;
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

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno{"+'\'' +
                "apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", fechaNac=" + fechaNac +
                ", edad=" + edad +
                ", materias=" + materias +
                '}';
    }
}
