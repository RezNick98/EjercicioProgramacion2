package Ejercicio6.Filtros;

import java.time.LocalDate;

import Ejercicio6.ElementoSimple;

public class FiltroAntiguedad extends Filtro{

    private LocalDate mesABuscar;

    public FiltroAntiguedad(LocalDate mesABuscar){
        this.mesABuscar=mesABuscar;
    }

    @Override
    public boolean cumple(ElementoSimple elemento) {
        return elemento.getAntiguedad().getMonthValue()>mesABuscar.getMonthValue();
    }
}
