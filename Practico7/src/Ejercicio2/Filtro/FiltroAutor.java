package Ejercicio2.Filtro;

import java.util.ArrayList;

import Ejercicio2.Documento;

public class FiltroAutor extends Filtro{

    private String autor;

    public FiltroAutor(String autor){
        this.autor=autor;
    }

    @Override
    public boolean cumple(Documento d) {
        return d.getAutores().contains(autor);
    }
    
}
