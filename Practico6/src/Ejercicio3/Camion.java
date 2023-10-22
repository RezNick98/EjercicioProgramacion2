package Ejercicio3;

import java.time.LocalDate;

public class Camion extends ElementoOrdenable{
    private LocalDate fechaCarga;
    private String nombre;

    public Camion(String nombre,LocalDate fechaCarga){
        this.nombre=nombre;
        this.fechaCarga=fechaCarga;
    }

    public LocalDate getFechaCarga() {
        return fechaCarga;
    }

    public void setFechaCarga(LocalDate fechaCarga) {
        this.fechaCarga = fechaCarga;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean atendidoPrimero(ElementoOrdenable otro) {
        return this.getFechaCarga().isBefore(((Camion)otro).getFechaCarga());
    }
    
    public void descargarCamion(){
        System.out.println("Descargando");
    }
}
