package Ejercicio3.Filtros;

import Ejercicio3.Planta;

public class FiltroNot extends Filtro{

    private Filtro f1;

    public FiltroNot(Filtro f1){
        this.f1=f1;
    }

    @Override
    public boolean cumple(Planta p) {
        return !f1.cumple(p);
    }
    
}
