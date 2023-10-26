package Ejercicio3.Criterios;

import java.util.Comparator;

import Ejercicio3.Mueble;

public class CriterioCostoFabricacion implements Comparator<Mueble>{

    @Override
    public int compare(Mueble mueb1, Mueble mueb2) {
        return Double.compare(mueb1.getCostoFabricacion(), mueb2.getCostoFabricacion());
    }
    
}
