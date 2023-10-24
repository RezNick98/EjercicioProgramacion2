package Ejercicio6;

import java.time.LocalDate;

public class ElementoDeprecated extends ElementoCompuesto{

    private double descuento;
    public ElementoDeprecated(int id, double valor, LocalDate antiguedad,double descuento) {
        super(id, valor, antiguedad);
        this.descuento=descuento;
        
    }
    public double getDescuento() {
        return descuento;
    }
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
    @Override
    public double getValor(){

    }

    @Override
    public LocalDate getAntiguedad(){
        
    }
}
