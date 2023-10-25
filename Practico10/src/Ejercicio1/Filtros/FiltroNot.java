package Ejercicio1.Filtros;

import Ejercicio1.OfertaLaboral;

public class FiltroNot extends Filtro{
    private Filtro f1;

    public FiltroNot(Filtro f1){
        this.f1=f1;
    }

    public boolean cumple(OfertaLaboral oferta){
        return f1.cumple(oferta);
    }
}
