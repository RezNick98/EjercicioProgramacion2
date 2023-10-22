package Ejercicio4.Filtros;

import Ejercicio4.Ficha;

public class FiltroNot extends Filtro{

    private Filtro f1;

    public FiltroNot(Filtro f1){
        this.f1=f1;
    }

    @Override
    public boolean cumple(Ficha f) {
        return !f1.cumple(f);
    }
    
}
