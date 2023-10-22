package Ejercicio5.Filtros;

import Ejercicio5.SeguroSimple;

public class FiltroMonto extends Filtro{
    private int montoMayorQue;

    public FiltroMonto(int montoMayorQue){
        this.montoMayorQue=montoMayorQue;
    }

    public boolean cumple(SeguroSimple seguro){
        return seguro.getMonto()>montoMayorQue;
    }
}
