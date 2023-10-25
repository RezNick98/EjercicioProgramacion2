package Ejercicio1;

import java.util.ArrayList;

import Ejercicio1.Filtros.Filtro;

public class Candidato {
    private String nombre;
    private String empresaEnLaQueTrabaja;
    private double sueldoActual;

    public Candidato(String nombre,String empresa,double sueldoActual){
        this.nombre=nombre;
        this.empresaEnLaQueTrabaja=empresa;
        this.sueldoActual=sueldoActual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresaEnLaQueTrabaja() {
        return empresaEnLaQueTrabaja;
    }

    public void setEmpresaEnLaQueTrabaja(String empresaEnLaQueTrabaja) {
        this.empresaEnLaQueTrabaja = empresaEnLaQueTrabaja;
    }

    public double getSueldoActual() {
        return sueldoActual;
    }

    public void setSueldoActual(double sueldoActual) {
        this.sueldoActual = sueldoActual;
    }

    public boolean aceptaOferta(Filtro filtro,OfertaLaboral oferta){
        if(filtro.cumple(oferta)){
            return true;
        }
        return false;
    }

}
