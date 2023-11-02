package edu.utn;


import edu.utn.model.Alumno;
import edu.utn.model.Materia;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
    Alumno pedro = new Alumno("Alcaraz","Pedro", "39.568.465", LocalDate.of(1992,01,22) );
    Materia algoritmos = new Materia("Algoritmos", LocalDate.of(2023,07,30)
            , LocalDate.of(2023,12,30));
    Materia estructurasDeDatos = new Materia("Estructuras de Datos", LocalDate.of(2023,01,30)
                , LocalDate.of(2023,12,30));
    //set de correlativas de esta materia en específico
    Set<Materia> correlativasParadigmas = new HashSet<>();
    correlativasParadigmas.add(algoritmos);
    correlativasParadigmas.add(estructurasDeDatos);
    Materia paradigmasDeProgramacion = new Materia("Paradigmas de la programacion", LocalDate.of(2023,01,30)
            , LocalDate.of(2023,12,30),correlativasParadigmas );

    Set<Materia> correlativasDiseñoSistemas = new HashSet<>();
    correlativasDiseñoSistemas.add(paradigmasDeProgramacion);
    Materia diseñoDeSistemas = new Materia("Diseño de Sistemas", LocalDate.of(2023,01,30)
                , LocalDate.of(2023,12,30),correlativasParadigmas );






    System.out.println(pedro.toString());
    System.out.println(diseñoDeSistemas.toString());

    }
}