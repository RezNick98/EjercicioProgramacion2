package Ejercicio5.Filtros;

import java.time.LocalDate;

import Ejercicio5.Pelicula;

public class FiltroAnio extends Filtro{
    private LocalDate aniABuscar;

    public FiltroAnio(LocalDate anio){
        this.aniABuscar=anio;
    }

    @Override
    public boolean cumple(Pelicula p) {
        return p.getAnioEstreno().isBefore(aniABuscar);
    }
    
}
