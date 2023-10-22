package Ejercicio5;

public class CalculadorFijo extends CalculadorPoliza{
    private double montoFijo;

    @Override
    public double CalculadorPoliza(ElementoPoliza elemento) {
        return elemento.getMonto()=this.montoFijo;
    }

    
    
}
