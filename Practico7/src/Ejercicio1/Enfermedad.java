package Ejercicio1;

import java.util.ArrayList;

public class Enfermedad {
    private String nombre;
    private ArrayList<String> estadosPatologico;

    public Enfermedad(String nombre){
        this.nombre=nombre;
        this.estadosPatologico=new ArrayList<>();
    }

    public void addEstadoPatologico(String es){
        this.estadosPatologico.add(es);
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public ArrayList<String> getEstadosPatologicos(){
        return new ArrayList<>(estadosPatologico);
    }
}
