package Ejercicio1;

public class Persona {
    private String nombre;
    private int dni;

    public Persona(String nombre,int dni){
        this.nombre=nombre;
        this.dni=dni;
    }

    public int getDni(){
        return this.dni;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

}
