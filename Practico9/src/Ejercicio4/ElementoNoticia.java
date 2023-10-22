package Ejercicio4;

import java.util.ArrayList;

import Ejercicio4.Filtros.*;;

public abstract class ElementoNoticia {
    
    public abstract int getCantidadaNoticias();

    public abstract ArrayList<Noticia> getNoticiaRestringida(Filtro filtro);
    
    
}
