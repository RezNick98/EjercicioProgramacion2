package Ejercicio1.Filtros;

import Ejercicio1.OfertaLaboral;

public class FiltroSueldo extends Filtro{
    private double sueldoABuscar;

    public FiltroSueldo(double sueldoABuscar){
        this.sueldoABuscar=sueldoABuscar;
    }

    public boolean cumple(OfertaLaboral oferta){
        return oferta.getMontoOfrecido()>=sueldoABuscar;
    }
}
