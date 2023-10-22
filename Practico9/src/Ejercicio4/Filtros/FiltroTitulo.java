package Ejercicio4.Filtros;

import Ejercicio4.Noticia;

public class FiltroTitulo extends Filtro{

    private String tituloABuscar;

    public FiltroTitulo(String titulo){
        this.tituloABuscar=titulo;
    }

    @Override
    public boolean cumple(Noticia n) {
        return n.getTitulo().equals(tituloABuscar);
    }
    
}
