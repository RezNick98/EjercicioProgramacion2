package Ejercicio1;

import java.util.ArrayList;

public class ProductoQuimico {
    private String nombre;
    private ArrayList<Cultivo> cultivosDesaconsejados;
    private ArrayList<String> estadosPatologicos;

    public ProductoQuimico(String nombre){
        this.nombre=nombre;
        this.cultivosDesaconsejados=new ArrayList<>();
        this.estadosPatologicos=new ArrayList<>();
    }

    public void addEstadoPatologico(String es){
        this.estadosPatologicos.add(es);
    }

    public void addCultivoDesaconsejado(Cultivo c){
        this.addCultivoDesaconsejado(c);
    }

    public ArrayList<Cultivo> getCultivosDesaconsejados(){
        return new ArrayList<>(cultivosDesaconsejados);
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public boolean trataEnfermedad(Enfermedad enfermedad){
        ArrayList<String> estadoPatologicosEnfermedad = enfermedad.getEstadosPatologicos();
        for(int i=0;i<estadoPatologicosEnfermedad.size();i++){
            if(!this.estadosPatologicos.contains(estadoPatologicosEnfermedad)){
                return false;
            }
        }
        return true;
    }
}
