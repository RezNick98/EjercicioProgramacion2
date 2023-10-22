package Ejercicio2.Filtro;

import Ejercicio2.Documento;

public class FiltroTituloContienePalabra extends Filtro{

    private String palabraABuscar;

    public FiltroTituloContienePalabra(String palabra){
        this.palabraABuscar=palabra;
    }

    @Override
    public boolean cumple(Documento d) {
        return d.getTitulo().contains(palabraABuscar);
    }

}