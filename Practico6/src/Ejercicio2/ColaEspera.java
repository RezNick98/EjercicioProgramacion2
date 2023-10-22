import java.util.ArrayList;

public class ColaEspera {
    private ArrayList<ElementoCola> elementos;

    public ColaEspera(){
        this.elementos=new ArrayList<>();
    }
    public void addElemento(ElementoCola elemento){
        boolean encontrado=false;
        int i =0;
        while(!encontrado && i<elementos.size()){
            if(elementos.get(i).esMayor(elemento)){
                i++;
            }else{
                encontrado=true;
            }
        }if (encontrado){
            elementos.add(i, elemento);
        }else{
            elementos.add(elemento);
        }
    }

    public ElementoCola elementoSiguiente(){
        ElementoCola siguiente=elementos.get(0);
        elementos.remove(0);
        return siguiente;
    }

    public boolean tieneElementos(){
        return this.elementos.size()>0;
    }

}
