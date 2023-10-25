package Ejercicio1;

import java.util.ArrayList;

import Ejercicio1.Filtros.Filtro;

public class Consultora {
    private Candidato candidatos;
    private ArrayList<OfertaLaboral> ofertasLaborales;

    public Consultora(Candidato candidato){
        this.candidatos=candidato;
        this.ofertasLaborales=new ArrayList<>();
    }

    public void addOfertaLaboral(OfertaLaboral oferta){
        if(!ofertasLaborales.contains(oferta)){
            this.ofertasLaborales.add(oferta);
        }
    }
    public ArrayList<OfertaLaboral> getOfertasLaborales(){
        return new ArrayList<>(ofertasLaborales);
    }

    public Candidato geCandidato(){
        return this.candidatos;
    }
    public ArrayList<Candidato> candidatosRestringido(Filtro f,OfertaLaboral oferta){
        ArrayList<Candidato> aux=new ArrayList<>();
        for(int i=0;i<this.ofertasLaborales.size();i++){
                if(candidatos.aceptaOferta(f, oferta)){
                    aux.add(candidatos);
                }
            }
            return aux;
        }
}
