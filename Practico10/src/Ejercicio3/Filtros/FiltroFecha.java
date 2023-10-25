package Ejercicio3.Filtros;

import java.time.LocalDate;

import Ejercicio3.Mueble;

public class FiltroFecha extends Filtro{
    private LocalDate fechaABuscar;

    public FiltroFecha(LocalDate fecha){
        this.fechaABuscar=fecha;
    }

    @Override
    public boolean cumple(Mueble mueble) {
        return mueble.getfMaxima().getMonthValue()<fechaABuscar.getMonthValue();
    }
}
