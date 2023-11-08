package edu.utn.actividad2;


import java.util.List;

@FunctionalInterface
public interface Transformador {
    List<String> transformar(List<String> lista);
}
