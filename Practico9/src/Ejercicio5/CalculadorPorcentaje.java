package Ejercicio5;

public class CalculadorPorcentaje extends CalculadorPoliza{
    private double porcentaje;

    public CalculadorPorcentaje(double monto,double porcentaje) {
        super(monto);
        this.porcentaje=porcentaje;
    }

    

    @Override
    public double CalculadorPoliza(ElementoPoliza elemento) {
        return this.getMontoFijo()+this.porcentaje;
    }



    public double getPorcentaje() {
        return porcentaje;
    }



    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
    
}
