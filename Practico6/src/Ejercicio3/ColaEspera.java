package Ejercicio3;

import java.util.ArrayList;

public class ColaEspera {
    private ArrayList<ElementoOrdenable> elementos;

    public ColaEspera(){
        this.elementos=new ArrayList<>();
    }

    public void addElemento(ElementoOrdenable elemento){
        boolean encontrado=false;
        int i=0;
        while(!encontrado && i<elementos.size()){
            if(elementos.get(i).atendidoPrimero(elemento)){
                i++;
            }else{
                encontrado=true;
            }
        }if(encontrado){
            elementos.add(i, elemento);
        }else{
            elementos.add(elemento);
        }
    }

    public boolean tieneElemento(){
        return this.elementos.size()>0;
    }

    public ElementoOrdenable siguiente(){
        ElementoOrdenable siguiente =elementos.get(0);
        elementos.remove(0);
        return siguiente;
    }
}
