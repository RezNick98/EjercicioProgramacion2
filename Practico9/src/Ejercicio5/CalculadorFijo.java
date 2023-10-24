package Ejercicio5;

public class CalculadorFijo extends CalculadorPoliza{

    public CalculadorFijo(double montoFijo){
        super(montoFijo);
    }
    @Override
    public double CalculadorPoliza(ElementoPoliza elemento) {
        return this.getMontoFijo();
    }

    
    
}
