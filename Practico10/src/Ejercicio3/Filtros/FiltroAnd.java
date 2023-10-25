package Ejercicio3.Filtros;

import Ejercicio3.Mueble;

public class FiltroAnd extends Filtro{
    private Filtro f1;
    private Filtro f2;

    public FiltroAnd(Filtro f1,Filtro f2){
        this.f1=f1;
        this.f2=f2;
    }
    @Override
    public boolean cumple(Mueble mueble) {
        return f1.cumple(mueble) && f2.cumple(mueble);
    }
    
}
