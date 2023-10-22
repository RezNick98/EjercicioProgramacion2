package Ejercicio3.Filtros;

import Ejercicio3.Planta;

public class FiltroClasificacion extends Filtro{

    private String clasificacionABuscar;

    public FiltroClasificacion(String clasificacion){
        this.clasificacionABuscar=clasificacion;
    }

    @Override
    public boolean cumple(Planta p) {
        return p.getClasificacion().equals(clasificacionABuscar);
    }
    
}
