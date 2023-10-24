package Ejercicio6.Filtros;

import Ejercicio6.ElementoSimple;

public class FiltroAnd extends Filtro{
    private Filtro f1;
    private Filtro f2;

    public FiltroAnd(Filtro f1,Filtro f2){
        this.f1=f1;
        this.f2=f2;
    }

    public boolean cumple(ElementoSimple elemento){
        return f1.cumple(elemento) && f2.cumple(elemento);
    }
}
