package Ejercicio5;

import java.time.LocalDate;

public class SeguroTemporal extends SeguroIntegrador{
    
    private LocalDate fInicio,fFin;


    public SeguroTemporal(int numeroPoliza, int montoPoliza,int dni,LocalDate fInicio,LocalDate fFin) {
        super(numeroPoliza, montoPoliza,dni);
        this.fInicio=fInicio;
        this.fFin=fFin;
    }


    public LocalDate getfInicio() {
        return fInicio;
    }


    public void setfInicio(LocalDate fInicio) {
        this.fInicio = fInicio;
    }


    public LocalDate getfFin() {
        return fFin;
    }


    public void setfFin(LocalDate fFin) {
        this.fFin = fFin;
    }

    public boolean seguroEnVigencia(){
        if(this.fInicio.isBefore(fFin)){
            return true;
        }
        return false;
    }

    @Override
    public double getMonto(){
        double montoTotal=0;
        if(seguroEnVigencia()==true){
            montoTotal+=this.montoPoliza;
        }else{
            return 0;
        }
        return montoTotal;
    }
    
}
