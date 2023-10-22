package Ejercicio3.Filtros;

import Ejercicio3.Planta;

public class FiltroNombreVulgar extends Filtro{
    private String nombreVulgarABuscar;

    public FiltroNombreVulgar(String nombreVulgar){
        this.nombreVulgarABuscar=nombreVulgar;
    }

    @Override
    public boolean cumple(Planta p) {
        return p.getNombreVulgar().equals(nombreVulgarABuscar);
    }
    
}
