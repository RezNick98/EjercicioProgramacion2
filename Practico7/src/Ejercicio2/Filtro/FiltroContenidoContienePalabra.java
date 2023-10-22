package Ejercicio2.Filtro;

import Ejercicio2.Documento;

public class FiltroContenidoContienePalabra extends Filtro{
    private String palabraABuscar;

    public FiltroContenidoContienePalabra(String palabra){
        this.palabraABuscar=palabra;
    }

    @Override
    public boolean cumple(Documento d) {
        return d.getContenido().contains(palabraABuscar);
    }
}
