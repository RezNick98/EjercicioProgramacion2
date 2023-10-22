package Ejercicio5;

import java.time.LocalDate;

public class SeguroTemporal extends SeguroIntegrador{
    
    private LocalDate fInicio,fFin;


    public SeguroTemporal(int numeroPoliza, int montoPoliza,int dni) {
        super(numeroPoliza, montoPoliza,dni);
        
    }
    
}
