package Ejercicio1;

import java.util.ArrayList;

public class Socio{
    private String nombre,apellido;
    private int edad;
    private boolean cuotaPaga;
    private ArrayList<AlquilerCancha> alquileres;

    public Socio(String nombre,String apellido,int edad,boolean cuotaPaga){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.cuotaPaga=cuotaPaga;
        this.alquileres=new ArrayList<>();

    }

    public void addAlquileres(AlquilerCancha alquiler){
        if(!this.alquileres.contains(alquiler)){
            this.alquileres.add(alquiler);
        }
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCuotaPaga() {
        return cuotaPaga;
    }

    public void setCuotaPaga(boolean cuotaPaga) {
        this.cuotaPaga = cuotaPaga;
    }
    
    public int cantVecesAlquiloCancha(int nroCancha){
        int contador=0;
        for(AlquilerCancha alquiler:alquileres){
            if(alquiler.getId()==nroCancha){
                contador++;
            }
        }
        return contador;
    }

    public boolean pagoMasDe(int precioQuePago){
        for (AlquilerCancha alquiler : alquileres) {
            if(alquiler.getPrecioCancha()>precioQuePago){
                return true;
            }   
        }
        return false;
    }

    public boolean socioAlquiloCancha(int nroCancha){
        for (AlquilerCancha alquilerCancha: alquileres) {
            if(alquilerCancha.getId()==nroCancha){
                return true;
            }
        }
        return false;
    }
}