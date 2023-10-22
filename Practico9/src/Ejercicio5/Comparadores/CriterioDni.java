package Ejercicio5.Comparadores;

import java.util.Comparator;

import Ejercicio5.ElementoPoliza;
import Ejercicio5.SeguroSimple;

public class CriterioDni implements Comparator<ElementoPoliza>{

    public int compare(ElementoPoliza segu1,ElementoPoliza segu2){
        return segu1.getDni()-segu2.getDni();

    }
    
}
