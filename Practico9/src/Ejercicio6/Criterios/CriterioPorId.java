package Ejercicio6.Criterios;

import java.util.Comparator;

import Ejercicio6.ElementoAlquilo;
import Ejercicio6.ElementoSimple;

public class CriterioPorId implements Comparator<ElementoAlquilo>{

    @Override
    public int compare(ElementoAlquilo elem1, ElementoAlquilo elem2) {
        return elem1.getId() - elem2.getId();
    }
    
}
