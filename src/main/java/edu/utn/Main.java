package edu.utn;


import edu.utn.model.Alumno;
import edu.utn.model.Materia;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
    Alumno pedro = new Alumno("Alcaraz","Pedro", "39.568.465", LocalDate.of(1992,01,22) );
    Materia algoritmos = new Materia("Algoritmos");
    Materia estructurasDeDatos = new Materia("Estructuras de Datos");
    //set de correlativas de esta materia en específico
    Set<Materia> correlativasParadigmas = new HashSet<>();
    correlativasParadigmas.add(algoritmos);
    correlativasParadigmas.add(estructurasDeDatos);
    Materia paradigmasDeProgramacion = new Materia("Paradigmas de la programacion", correlativasParadigmas );

    Set<Materia> correlativasDiseñoSistemas = new HashSet<>();
    correlativasDiseñoSistemas.add(paradigmasDeProgramacion);
    Materia diseñoDeSistemas = new Materia("Diseño de Sistemas",correlativasParadigmas );

    System.out.println(pedro.toString());
    System.out.println(diseñoDeSistemas.toString());

    }
}