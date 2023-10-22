package Ejercicio5.Filtros;

import Ejercicio5.Pelicula;

public class FiltroTitulo extends Filtro{

    private String palabraABuscar;

    public FiltroTitulo(String palabra){
        this.palabraABuscar=palabra;
    }

    @Override
    public boolean cumple(Pelicula p) {
        return p.getTitulo().contains(palabraABuscar);
    }


    
}
