package Ejercicio5.Filtros;

import Ejercicio5.Pelicula;

public class FiltroDuracion extends Filtro{
    private double duracionABuscar;

    public FiltroDuracion(double duracion){
        this.duracionABuscar=duracion;
    }

    @Override
    public boolean cumple(Pelicula p) {
        return p.getDuracion()<duracionABuscar;
    }
    
}
