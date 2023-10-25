package Ejercicio3.Filtros;

import Ejercicio3.Mueble;

public class FiltroOr extends Filtro{
    private Filtro f1;
    private Filtro f2;

    public FiltroOr(Filtro f1,Filtro f2){
        this.f1=f1;
        this.f2=f2;
    }

    @Override
    public boolean cumple(Mueble mueble) {
        return f1.cumple(mueble) || f2.cumple(mueble);
    }
    
}
