package Ejercicio3;

import java.util.ArrayList;

public class Lote {
    private int nroLote;
    private ArrayList<Mineral> mineralesQueContieneLote;
    private int cantHectareas;

    public Lote(int nroLote, int cantHectareas) {
        this.nroLote = nroLote;
        this.cantHectareas = cantHectareas;
        this.mineralesQueContieneLote = new ArrayList<>();
    }

    public void addMinerales(Mineral m) {
        this.mineralesQueContieneLote.add(m);
    }

    public ArrayList<Mineral> getMinerales() {
        return new ArrayList<>();
    }

    public int getNroLote() {
        return nroLote;
    }

    public void setNroLote(int nroLote) {
        this.nroLote = nroLote;
    }

    public int getCantHectareas() {
        return cantHectareas;
    }

    public void setCantHectareas(int cantHectareas) {
        this.cantHectareas = cantHectareas;
    }

    public boolean sePuedeSembrarCereal(Cereal c) {
        return c.sePuedeSembrar(this);
    }

    public boolean elLoteEsEspecial() {
        for (int i = 0; i < mineralesQueContieneLote.size(); i++) {
            if (this.mineralesQueContieneLote.get(i).isMineralPrimario()) {
                return true;
            }
        }
        return false;
    }
}
