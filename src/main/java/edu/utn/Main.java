package edu.utn;


import edu.utn.actividad1.model.Alumno;
import edu.utn.actividad1.model.Inscripcion;
import edu.utn.actividad1.model.Materia;
import edu.utn.actividad2.Transformador;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String [] meses = {"Enero","Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" };
        List<String> listaMeses = Arrays.asList(meses);

        Transformador mesesMayuscula = (List<String> mesesMinuscula) -> {
            return mesesMinuscula.stream()
                    .map(m -> m.toUpperCase())
                    .collect(Collectors.toList());
        };

        System.out.println(mesesMayuscula.transformar(listaMeses));
    }
}