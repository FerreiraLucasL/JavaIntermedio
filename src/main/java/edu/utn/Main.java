package edu.utn;


import edu.utn.model.Alumno;
import edu.utn.model.Materia;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    Alumno pedro = new Alumno("Alcaraz","Pedro", "39.568.465", LocalDate.of(1992,07,22) );
    Materia algoritmos = new Materia("Algoritmos", LocalDate.of(2023,07,30)
            , LocalDate.of(2023,12,30));

    System.out.println(pedro.toString());
    System.out.println(algoritmos.toString());

    }
}