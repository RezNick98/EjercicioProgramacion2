package Ejercicio2.Filtro;

import Ejercicio2.Documento;

public class FiltroNot extends Filtro{
    private Filtro f1;

    public FiltroNot(Filtro f1){
        this.f1=f1;
    }

    @Override
    public boolean cumple(Documento d) {
        return !f1.cumple(d);
    }
    
}
