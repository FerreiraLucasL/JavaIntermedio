package edu.utn.model;

import java.time.LocalDate;
import java.util.*;

public class Materia {
    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaFinal;
    private Set<Alumno> alumnos = new HashSet<>();
    
}
