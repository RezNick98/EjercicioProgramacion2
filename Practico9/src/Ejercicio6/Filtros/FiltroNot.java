package Ejercicio6.Filtros;

import Ejercicio6.ElementoSimple;

public class FiltroNot extends Filtro{
    private Filtro f1;

    public FiltroNot(Filtro f1){
        this.f1=f1;
    }

    public boolean cumple(ElementoSimple elemento){
        return !f1.cumple(elemento);
    }
}
