package Ejercicio3.Filtros;

import Ejercicio3.Mueble;

public class FiltroCaracteristica extends Filtro{

    private String caracteristicaABuscar;

    public FiltroCaracteristica(String caracteristica){
        this.caracteristicaABuscar=caracteristica;
    }

    @Override
    public boolean cumple(Mueble mueble) {
        return mueble.getCaracteristicas(caracteristicaABuscar);
    }
    
}
