package Ejercicio4.Filtros;

import Ejercicio4.Ficha;

public class FiltroEspacio extends Filtro{

    private int espacioABuscar;

    public FiltroEspacio(int espacioABuscar){
        this.espacioABuscar=espacioABuscar;
    }

    @Override
    public boolean cumple(Ficha f) {
        return f.getEspacioFicha()>espacioABuscar;
    }
    
}
