package Ejercicio1;

import java.util.ArrayList;

public class Cultivo {
    private String nombre;
    private ArrayList<Enfermedad> enfermedadesFrecuentes;

    
    public Cultivo(String nombre){
        this.nombre=nombre;
        this.enfermedadesFrecuentes=new ArrayList<>();
    }

    public void addEnfermedadFrecuente(Enfermedad e){
        this.enfermedadesFrecuentes.add(e);
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public boolean productoQuimicoAconsejado(ProductoQuimico pq){
        for(int i=0;i<enfermedadesFrecuentes.size();i++){
            Enfermedad enfermedadi=this.enfermedadesFrecuentes.get(i);
            if((pq.trataEnfermedad(enfermedadi)) && 
            (!pq.getCultivosDesaconsejados().contains(this))){
                return true;
            }
        }
        return false;
    }
}

