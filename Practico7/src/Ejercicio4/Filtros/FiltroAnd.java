package Ejercicio4.Filtros;

import Ejercicio4.Ficha;

public class FiltroAnd extends Filtro{

    private Filtro f1;
    private Filtro f2;

    public FiltroAnd(Filtro f1,Filtro f2){
        this.f1=f1;
        this.f2=f2;
    }


    @Override
    public boolean cumple(Ficha f) {
        return f1.cumple(f) && f2.cumple(f);
    }
    
}
