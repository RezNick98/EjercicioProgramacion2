package Ejercicio5.Filtros;

import Ejercicio5.SeguroSimple;

public class FiltroNot extends Filtro{

    private Filtro f1;

    public FiltroNot(Filtro f1){
        this.f1=f1;
    }

    public boolean cumple(SeguroSimple seguro){
        return !f1.cumple(seguro);
    }
    
}
