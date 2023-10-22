package Ejercicio5.Filtros;

import Ejercicio5.Pelicula;

public class FiltroActor extends Filtro{

    private String actorABuscar;

    public FiltroActor(String actor){
        this.actorABuscar=actor;
    }

    @Override
    public boolean cumple(Pelicula p) {
        return p.getActores().contains(actorABuscar);
    }
    
}
