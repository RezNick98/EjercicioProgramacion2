package Ejercicio5.Filtros;

import Ejercicio5.Pelicula;

public class FiltroGenero extends Filtro{

    private String generoABuscar;

    public FiltroGenero(String genero){
        this.generoABuscar=genero;
    }

    @Override
    public boolean cumple(Pelicula p) {
        return p.getgeneros().contains(generoABuscar);
    }
    
}
