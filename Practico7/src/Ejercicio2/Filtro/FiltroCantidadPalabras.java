package Ejercicio2.Filtro;

import Ejercicio2.Documento;

public class FiltroCantidadPalabras extends Filtro{
    private int cantPalabrasABuscar;

    public FiltroCantidadPalabras(int cantPalabrasABuscar){
        this.cantPalabrasABuscar=cantPalabrasABuscar;
    }

    @Override
    public boolean cumple(Documento d) {
        return d.getContenido().length()>cantPalabrasABuscar;
    }
    
}
