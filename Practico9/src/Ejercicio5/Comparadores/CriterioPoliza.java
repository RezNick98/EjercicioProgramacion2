package Ejercicio5.Comparadores;

import java.util.Comparator;

import Ejercicio5.ElementoPoliza;

public class CriterioPoliza implements Comparator<ElementoPoliza>{

    @Override
    public int compare(ElementoPoliza segu1, ElementoPoliza segu2) {
        return segu1.getNumeroPoliza()-segu2.getNumeroPoliza();
    }
    
}
