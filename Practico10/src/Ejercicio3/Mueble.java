package Ejercicio3;

import java.time.LocalDate;
import java.util.ArrayList;

public class Mueble {
    private String material;
    private ArrayList<String> caracteristicas;
    private LocalDate fMaxima;
    private double costoFabricacion;
    private double costoVenta;

    public Mueble(String material,LocalDate fMaxima,double costoFabricacion,double costoVenta){
        this.material=material;
        this.fMaxima=fMaxima;
        this.costoFabricacion=costoFabricacion;
        this.costoVenta=costoVenta;
        this.caracteristicas=new ArrayList<>();
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public LocalDate getfMaxima() {
        return fMaxima;
    }

    public void setfMaxima(LocalDate fMaxima) {
        this.fMaxima = fMaxima;
    }

    public double getCostoFabricacion() {
        return costoFabricacion;
    }

    public void setCostoFabricacion(double costoFabricacion) {
        this.costoFabricacion = costoFabricacion;
    }

    public double getCostoVenta() {
        return costoVenta;
    }

    public void setCostoVenta(double costoVenta) {
        this.costoVenta = costoVenta;
    }

    public void addCaracteristica(String c){
        if(!this.caracteristicas.contains(c)){
            this.caracteristicas.add(c);
        }
    }

    public boolean getCaracteristicas(String c){
        return this.caracteristicas.contains(c);
    }
    
    
}
