package Ejercicio1;

import java.util.ArrayList;

public class Compania {
    private ArrayList<Encuesta> encuestas;

    public Compania(ArrayList<Encuesta> encuestas){
        this.encuestas=new ArrayList<>(encuestas);
    }

    public void addEncuesta(Encuesta encuesta){
        this.encuestas.add(encuesta);
    }

    public ArrayList<Encuesta> getEncuestas(){
        return encuestas;
    }

    
}
