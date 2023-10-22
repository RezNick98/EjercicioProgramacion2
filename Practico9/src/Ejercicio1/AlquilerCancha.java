package Ejercicio1;

import java.time.LocalDate;

public class AlquilerCancha {
    private LocalDate fechaDeAlquiler;
    private int id;
    private double precioCancha;

    public AlquilerCancha(LocalDate fechaAlquiler,int id,double precioCancha){
        this.fechaDeAlquiler=fechaAlquiler;
        this.id=id;
        this.precioCancha=precioCancha;
    }



    public LocalDate getFechaDeAlquiler() {
        return fechaDeAlquiler;
    }

    public void setFechaDeAlquiler(LocalDate fechaDeAlquiler) {
        this.fechaDeAlquiler = fechaDeAlquiler;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrecioCancha() {
        return precioCancha;
    }

    public void setPrecioCancha(double precioCancha) {
        this.precioCancha = precioCancha;
    }

    public boolean equals(Object o){
        try {
            AlquilerCancha otro = (AlquilerCancha)o;
            return this.getId()==otro.getId();
        } catch (Exception e) {
            return false;
        }
    }
}
