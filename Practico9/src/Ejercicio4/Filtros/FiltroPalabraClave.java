package Ejercicio4.Filtros;

import Ejercicio4.Noticia;

public class FiltroPalabraClave extends Filtro{

    private String palabraABuscar;

    public FiltroPalabraClave(String palabra){
        this.palabraABuscar=palabra;
    }
    @Override
    public boolean cumple(Noticia n) {
        return n.getPalabras(palabraABuscar);
    }
    
}
