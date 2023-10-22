package Ejercicio2.Filtro;

import Ejercicio2.Documento;

public class FiltroAnd extends Filtro{
    private Filtro f1;
    private Filtro f2;

    public FiltroAnd(Filtro f1,Filtro f2){
        this.f1=f1;
        this.f2=f2;
    }

    @Override
    public boolean cumple(Documento d) {
        return f1.cumple(d) && f2.cumple(d);
    }


    
}
