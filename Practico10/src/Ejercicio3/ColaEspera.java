package Ejercicio3;

import java.util.ArrayList;

public class ColaEspera {
    private ArrayList<Comparable> elementos;

    public ColaEspera(){
        this.elementos=new ArrayList<>();
    }

    public void agregarElemento(Comparable elemento){
        boolean encontro = false;
        int i=0;
        if((i<elementos.size()) && (!encontro)){
            if(elemento.compareTo(elementos.get(i))<0){
                i++;
            }else{
                encontro=true;
            }
        }
        if(encontro){
            elementos.add(i,elemento);
        }else{
            elementos.add(elemento);
        }
    }

    public int cantElementos(){
        return elementos.size();
    }
}
