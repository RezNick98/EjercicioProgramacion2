package Ejercicio3.Criterios;

import java.util.Comparator;

import Ejercicio3.Mueble;

public class CriterioFechaEntrega implements Comparator<Mueble>{

    @Override
    public int compare(Mueble mueb1, Mueble mueb2) {
        if(mueb1.getfMaxima().isBefore(mueb2.getfMaxima())){
            return 1;
        }else if(mueb1.getfMaxima().isAfter(mueb2.getfMaxima())){
            return -1;
        }else{
            return 0;
        }
    }
    
}
