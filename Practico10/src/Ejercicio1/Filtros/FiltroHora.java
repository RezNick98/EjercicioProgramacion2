package Ejercicio1.Filtros;

import Ejercicio1.OfertaLaboral;

public class FiltroHora extends Filtro{
    private int horasSemanalesABuscar;

    public FiltroHora(int horasSemanalesABuscar){
        this.horasSemanalesABuscar=horasSemanalesABuscar;
    }

    public boolean cumple(OfertaLaboral oferta){
        return oferta.getHorasSemanales()==horasSemanalesABuscar;
    }
}
