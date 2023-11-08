package edu.utn;


import edu.utn.actividad1.model.Alumno;
import edu.utn.actividad1.model.Inscripcion;
import edu.utn.actividad1.model.Materia;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
    Alumno pedro = new Alumno("Alcaraz","Pedro" );
    Materia algoritmos = new Materia("Algoritmos", 1);
    Materia estructurasDeDatos = new Materia("Estructuras de Datos", 1);
    //set de correlativas de esta materia en específico
    Set<Materia> correlativasParadigmas = new HashSet<>();
    correlativasParadigmas.add(algoritmos);
    correlativasParadigmas.add(estructurasDeDatos);
    Materia paradigmasDeProgramacion = new Materia("Paradigmas de la programacion", 2 ,correlativasParadigmas );

    Set<Materia> correlativasDiseñoSistemas = new HashSet<>();
    correlativasDiseñoSistemas.add(paradigmasDeProgramacion);
    Materia diseñoDeSistemas = new Materia("Diseño de Sistemas",3,correlativasDiseñoSistemas );

    Inscripcion inscribirNivel1 = (alumno, materia) -> {
        if(materia.getNivel() == 1){
            alumno.getMaterias().add(materia);
            return true;
        }else{
            return false;
        }
    };

    Inscripcion inscribirConCorrelativas = (alumno, materia) -> {
        return alumno.getMaterias().stream()
                .allMatch(m -> materia.getCorrelativas().contains(m));
    };

    System.out.println(inscribirNivel1.inscribir(pedro, algoritmos));
    inscribirNivel1.inscribir(pedro, estructurasDeDatos);
    System.out.println(inscribirConCorrelativas.inscribir(pedro, paradigmasDeProgramacion));
    System.out.println(pedro.toString());
    System.out.println(diseñoDeSistemas.toString());
    }
}