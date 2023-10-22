package Ejercicio2.Filtro;

import Ejercicio2.Documento;

public class FiltroTituloIgual extends Filtro{

    private String titulo;

    public FiltroTituloIgual(String titulo){
        this.titulo=titulo;
    }

    @Override
    public boolean cumple(Documento d) {
        return d.getTitulo().equals(titulo);
    }
    
}
