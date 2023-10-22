package Ejercicio1.Comparadores;

import java.util.Comparator;

import Ejercicio1.Socio;

public class ComparadorCantVecesAlquiladaCancha implements Comparator<Socio>{

    private int nroCanchaABuscar;

    
    public ComparadorCantVecesAlquiladaCancha(int nroCanchaABuscar) {
        this.nroCanchaABuscar = nroCanchaABuscar;
    }


    @Override
    public int compare(Socio soc1, Socio soc2) {
        return soc1.cantVecesAlquiloCancha(nroCanchaABuscar)-soc2.cantVecesAlquiloCancha(nroCanchaABuscar);
    }
}
