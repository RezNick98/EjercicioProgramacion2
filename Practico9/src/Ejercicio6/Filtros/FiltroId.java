package Ejercicio6.Filtros;

import Ejercicio6.ElementoSimple;

public class FiltroId extends Filtro{
    private int idABuscar;

    public FiltroId(int idABuscar){
        this.idABuscar=idABuscar;
    }

    @Override
    public boolean cumple(ElementoSimple elemento) {
        return elemento.getId()==idABuscar;
    }
    
}
