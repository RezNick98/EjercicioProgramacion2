package Ejercicio4.Filtros;

import Ejercicio4.Ficha;

public class FiltroFortaleza extends Filtro{

    private int fortalezaABuscar;

    public FiltroFortaleza(int fortalezaABuscar){
        this.fortalezaABuscar=fortalezaABuscar;
    }

    @Override
    public boolean cumple(Ficha f) {
        return f.getFortaleza()>fortalezaABuscar;
    }
    
}
