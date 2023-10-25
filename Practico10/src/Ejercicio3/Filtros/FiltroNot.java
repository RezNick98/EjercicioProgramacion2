package Ejercicio3.Filtros;

import Ejercicio3.Mueble;

public class FiltroNot extends Filtro{
    private Filtro f1;

    public FiltroNot(Filtro f1){
        this.f1=f1;
    }

    public boolean cumple(Mueble mueble){
        return !f1.cumple(mueble);
    }
}
