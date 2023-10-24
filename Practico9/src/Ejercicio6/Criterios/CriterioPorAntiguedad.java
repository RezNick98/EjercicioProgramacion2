package Ejercicio6.Criterios;

import java.util.Comparator;

import Ejercicio6.ElementoAlquilo;

public class CriterioPorAntiguedad implements Comparator<ElementoAlquilo>{

    public int compare (ElementoAlquilo elem1,ElementoAlquilo elem2){
        return elem1.getAntiguedad().getMonthValue() - elem2.getAntiguedad().getMonthValue();
    }
    
}
