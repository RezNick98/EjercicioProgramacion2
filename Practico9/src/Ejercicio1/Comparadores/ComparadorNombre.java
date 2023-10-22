package Ejercicio1.Comparadores;

import java.util.Comparator;

import Ejercicio1.Socio;

public class ComparadorNombre implements Comparator<Socio>{

    @Override
    public int compare(Socio soc1, Socio soc2) {
        return soc1.getNombre().compareTo(soc2.getNombre());
    }


    
}
