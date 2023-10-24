package Ejercicio6;

import java.time.LocalDate;

public class ElementoSimple extends ElementoAlquilo{
    private String descripcion;

    public ElementoSimple(int id,double valor,String descripcion,LocalDate antiguedad){
        super(id,valor,antiguedad);
        this.descripcion=descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public double getValor(){
        return this.getValor();
    }

    public int getId(){
        return getId();
    }

    @Override
    public LocalDate getAntiguedad() {
        return this.getAntiguedad();
    }

    public boolean equals(Object o){
        try {
            ElementoSimple otro=(ElementoSimple)o;
            return this.getId()==otro.getId();
        } catch (Exception e) {
            return false;
        }
    }

}
