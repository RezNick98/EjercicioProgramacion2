package Ejercicio5.Filtros;

import Ejercicio5.SeguroSimple;

public class FiltroDni extends Filtro{

    private int dniABuscar;

    public FiltroDni(int dniABuscar){
        this.dniABuscar=dniABuscar;
    }

    @Override
    public boolean cumple(SeguroSimple seguro) {
        return seguro.getDni()==dniABuscar;
    }
    
}
