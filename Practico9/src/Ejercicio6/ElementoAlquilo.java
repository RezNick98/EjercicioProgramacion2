package Ejercicio6;

import java.time.LocalDate;

public abstract class ElementoAlquilo {
    private int id;
    private double valor;
    private LocalDate antiguedad;

    public ElementoAlquilo(int id,double valor,LocalDate antiguedad){
        this.id=id;
        this.valor=valor;
        this.antiguedad=antiguedad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract double getValor();

    public abstract LocalDate getAntiguedad();
    
}
