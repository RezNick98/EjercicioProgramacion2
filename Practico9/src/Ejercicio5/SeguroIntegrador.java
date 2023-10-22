package Ejercicio5;

import java.util.ArrayList;

public class SeguroIntegrador extends ElementoPoliza{

    private ArrayList<ElementoPoliza> seguros;

    public SeguroIntegrador(int numeroPoliza, int montoPoliza,int dni) {
        super(numeroPoliza, montoPoliza,dni);
        this.seguros=new ArrayList<>();
        
    }

    @Override
    public int getMonto() {
        int sumaTotal=0;
        for (ElementoPoliza elementos : this.seguros) {
            sumaTotal+=elementos.getMonto();
        }
        return sumaTotal;
    }
    @Override
    public int getNumeroPoliza(){
        return 0;
    }
    
}
