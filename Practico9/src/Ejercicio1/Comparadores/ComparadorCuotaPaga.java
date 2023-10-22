package Ejercicio1.Comparadores;

import java.util.Comparator;

import Ejercicio1.Socio;

public class ComparadorCuotaPaga implements Comparator<Socio>{


    @Override
    public int compare(Socio soc1, Socio soc2) {
        return Boolean.compare(soc1.isCuotaPaga(), soc2.isCuotaPaga());
    }
    
}
