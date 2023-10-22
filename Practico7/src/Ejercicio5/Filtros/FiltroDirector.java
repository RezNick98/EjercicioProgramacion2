package Ejercicio5.Filtros;

import Ejercicio5.Pelicula;

public class FiltroDirector extends Filtro{

    private String directorABuscar;

    public FiltroDirector(String director){
        this.directorABuscar=director;
    }

    @Override
    public boolean cumple(Pelicula p) {
        return p.getgeneros().contains(directorABuscar);
    }
    
}
