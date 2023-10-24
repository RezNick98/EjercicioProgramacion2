package Ejercicio6.Filtros;

import Ejercicio6.ElementoSimple;

public class FiltroContienePalabra extends Filtro{
    private String palabraABuscar;

    public FiltroContienePalabra(String palabraABuscar){
        this.palabraABuscar=palabraABuscar;
    }

    public boolean cumple(ElementoSimple elemento){
        return elemento.getDescripcion().contains(palabraABuscar);
    }
}
