package Ejercicio4.Filtros;

import Ejercicio4.Noticia;

public class FiltroAutor extends Filtro{
    private String autorABuscar;

    @Override
    public boolean cumple(Noticia n) {
        return n.getAutor().equals(autorABuscar);
    }
    
}
