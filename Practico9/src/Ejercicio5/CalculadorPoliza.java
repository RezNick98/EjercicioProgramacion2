package Ejercicio5;

public abstract class CalculadorPoliza {

    private double monto;

    public CalculadorPoliza(double monto){
        this.monto=monto;
    }
    
    public double getMontoFijo(){
        return this.monto;
    }

    public abstract double CalculadorPoliza(ElementoPoliza elemento);
}
