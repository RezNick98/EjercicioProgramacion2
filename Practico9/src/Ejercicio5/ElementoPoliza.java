package Ejercicio5;

public abstract class ElementoPoliza {
    protected int numeroPoliza;
    protected double montoPoliza;
    protected int dni;

    public ElementoPoliza(int numeroPoliza,double montoPoliza,int dni){
        this.numeroPoliza=numeroPoliza;
        this.montoPoliza=montoPoliza;
        this.dni=dni;
    }

    public int getDni(){
        return this.dni;
    }

    public abstract int getNumeroPoliza();

    public abstract double getMonto();
    
}
