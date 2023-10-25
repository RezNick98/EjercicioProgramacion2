package Ejercicio5;

import java.util.ArrayList;

public class SeguroIntegrador extends ElementoPoliza{

    private ArrayList<ElementoPoliza> seguros;

    public SeguroIntegrador(int numeroPoliza, int montoPoliza,int dni) {
        super(numeroPoliza, montoPoliza,dni);
        this.seguros=new ArrayList<>();
        
    }

    @Override
    public double getMonto() {
        int sumaTotal=0;
        for (ElementoPoliza elementos : this.seguros) {
            sumaTotal+=elementos.getMonto();
        }
        return sumaTotal;
    }
    @Override
    public int getNumeroPoliza(){
        int numeroPolizaAux=0;
        int numeroPolizaMax=0;
        int i=0;
        while(i<seguros.size()){
            numeroPolizaAux=seguros.get(i).getNumeroPoliza();
            if(numeroPolizaMax<numeroPolizaAux){
                numeroPolizaMax=numeroPolizaAux;
                i++;
            }else{
                i++;
            }
        }
        return numeroPolizaMax;
    }
    
}
