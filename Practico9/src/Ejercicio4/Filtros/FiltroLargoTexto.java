package Ejercicio4.Filtros;

import Ejercicio4.Noticia;

public class FiltroLargoTexto extends Filtro{
    private int largoABuscar;

    public FiltroLargoTexto(int largoABuscar){
        this.largoABuscar=largoABuscar;
    }

    @Override
    public boolean cumple(Noticia n) {
        return n.getTexto().length()>largoABuscar;
    }

}