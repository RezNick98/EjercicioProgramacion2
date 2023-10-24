package Ejercicio6;

import java.time.LocalDate;
import java.util.ArrayList;

public class ElementoCompuesto extends ElementoAlquilo{
    private ArrayList<ElementoAlquilo> elementos;

    public ElementoCompuesto(int id, double valor, LocalDate antiguedad) {
        super(id, valor, antiguedad);
        this.elementos=new ArrayList<>();
    }

    public void addElementos(ElementoAlquilo elemento){
        if(!elementos.contains(elemento)){
            this.elementos.add(elemento);
        }
    }

    public ArrayList<ElementoAlquilo> getElementos(){
        return new ArrayList<>(elementos);
    }

    @Override
    public double getValor() {
        double result=0;
        for (ElementoAlquilo elementoAlquilo : elementos) {
            result +=elementoAlquilo.getValor();
        }
        return result;
    }

    @Override
    public LocalDate getAntiguedad() {
        int indice=0;
        LocalDate antiguedadMayor=null;
        LocalDate antiguedadAux=null;
        while(indice<elementos.size()){
            antiguedadAux=elementos.get(indice).getAntiguedad();
            if(antiguedadMayor.getMonthValue()<antiguedadAux.getMonthValue()){
                antiguedadMayor=antiguedadAux;
                indice++;
            }else{
                indice++;
            }
        }
        return antiguedadMayor;
    }
    
}
