package Ejercicio3.Filtros;

import Ejercicio3.Planta;

public class FiltroNombreCientifico extends Filtro{

    private String nombreCientificoABuscar;

    public FiltroNombreCientifico(String nombre){
        this.nombreCientificoABuscar=nombre;
    }

    @Override
    public boolean cumple(Planta p) {
        return p.getNombreCientifico().contains(nombreCientificoABuscar);
    }
    
}
