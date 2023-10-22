package Ejercicio3;

public class Barco extends ElementoOrdenable{
    private String nombre;
    private int capacidad;

    public Barco(String nombre,int capacidad){
        this.nombre=nombre;
        this.capacidad=capacidad;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void setCapacidad(int capacidad){
        this.capacidad=capacidad;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getCapacidad(){
        return this.capacidad;
    }

    @Override
    public boolean atendidoPrimero(ElementoOrdenable otro) {
        return this.getCapacidad()>((Barco)otro).getCapacidad();
        
    }

    
}
