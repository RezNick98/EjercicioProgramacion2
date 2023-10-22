package Ejercicio4.Filtros;

import Ejercicio4.Ficha;

public class FiltroPoderDestruccion extends Filtro{

    private int poderDestruccionABuscar;

    public FiltroPoderDestruccion(int poderDeDestruccion){
        this.poderDestruccionABuscar=poderDeDestruccion;
    }

    @Override
    public boolean cumple(Ficha f) {
        return f.getPoderDeDestruccion()>poderDestruccionABuscar;
    }
    
}
