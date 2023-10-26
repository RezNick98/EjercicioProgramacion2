package Ejercicio3.Criterios;

import java.util.Comparator;

import Ejercicio3.Mueble;

public class CriterioCostoVenta implements Comparator<Mueble>{

    public int compare(Mueble mueb1,Mueble mueb2){
        return Double.compare(mueb1.getCostoVenta(), mueb2.getCostoVenta());
    }
    
}
