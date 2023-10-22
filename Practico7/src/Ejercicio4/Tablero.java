package Ejercicio4;

import java.util.ArrayList;

public class Tablero {
    private ArrayList<Ficha> fichas;
    private double minPuntaje;
    private int dificultad;

    public Tablero(double minPuntaje,int dificultad){
        this.minPuntaje=minPuntaje;
        this.dificultad=dificultad;
        this.fichas=new ArrayList<>();
    }

    public void addFichas(Ficha f){
        this.fichas.add(f);
    }

    public ArrayList<Ficha> getFichas(){
        return new ArrayList<>(fichas);
    }

    public double getMinPuntaje() {
        return minPuntaje;
    }

    public void setMinPuntaje(double minPuntaje) {
        this.minPuntaje = minPuntaje;
    }

    public int getDificultad() {
        int sumatoriaFortalezas=0;
        int sumatoriaPoder=0;
        for(Ficha ficha:fichas){
            sumatoriaFortalezas+=ficha.getFortaleza();
            sumatoriaPoder+=ficha.getPoderDeDestruccion();
        }
        return dificultad=sumatoriaFortalezas/sumatoriaPoder;
    }

    
    
}
