package Ejercicio5.Comparadores;

import java.util.Comparator;

import Ejercicio5.ElementoPoliza;

public class CriterioAnd implements Comparator<ElementoPoliza>{

    private Comparator criterio1;
    private Comparator criterio2;

    public CriterioAnd(Comparator<ElementoPoliza> criterio1,Comparator<ElementoPoliza> criterio2){
        this.criterio1=criterio1;
        this.criterio2=criterio2;
    }

    @Override
    public int compare(ElementoPoliza segu1, ElementoPoliza segu2) {
        int resultado= criterio1.compare(segu1, segu2);
        if(resultado==0){
            return resultado=criterio2.compare(segu1, segu2);
        }else{
            return resultado;
        }
    }


    
}
