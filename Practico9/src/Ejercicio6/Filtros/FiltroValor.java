package Ejercicio6.Filtros;

import Ejercicio6.ElementoSimple;

public class FiltroValor extends Filtro{
    private double valorABuscar;

    public FiltroValor(double valorABuscar){
        this.valorABuscar=valorABuscar;
    }

    public boolean cumple(ElementoSimple elemento){
        return elemento.getValor()>valorABuscar;
    }
}
