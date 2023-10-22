package Ejercicio1.Comparadores;

import java.util.Comparator;

import Ejercicio1.Socio;

public class ComparadorApellido implements Comparator<Socio>{

    public int compare(Socio soc1,Socio soc2){
        return soc1.getApellido().compareTo(soc2.getApellido());
    }
    
}
