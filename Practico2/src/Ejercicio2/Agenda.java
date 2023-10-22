package Ejercicio2;

import java.util.ArrayList;

public class Agenda {
    private String lugar;
    private ArrayList<Participante> participantes;
    private String temaATratar;
    private float duracion;

    public Agenda(String lugar,ArrayList participantes,String temaATratar,float duracion){
        this.lugar=lugar;
        this.participantes=new ArrayList<>(participantes);
        this.temaATratar=temaATratar;
        this.duracion=duracion;
    }

    public void addParticipante(Participante p){
        this.participantes.add(p);
    }

    public ArrayList<Participante> getParticipantes(){
        return participantes;
    }

    
}
