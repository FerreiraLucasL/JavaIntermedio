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

}
