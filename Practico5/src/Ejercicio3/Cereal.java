package Ejercicio3;

import java.util.ArrayList;

public class Cereal {
    private String nombreCereal;
    private ArrayList<Mineral> mineralesQueRequiere;

    public Cereal(String nombreCereal) {
        this.mineralesQueRequiere = new ArrayList<>();
        this.nombreCereal = nombreCereal;
    }

    public void addMinerales(Mineral m) {
        this.mineralesQueRequiere.add(m);
    }

    public ArrayList<Mineral> getMinerales() {
        return new ArrayList<>(mineralesQueRequiere);
    }

    public void setNombreCereal(String nombre) {
        this.nombreCereal = nombre;
    }

    public String getNombreCereal() {
        return this.nombreCereal;
    }

    public boolean sePuedeSembrar(Lote l1) {
        for (int i = 0; i < mineralesQueRequiere.size(); i++) {
            if (!l1.getMinerales().contains(this.mineralesQueRequiere.get(i))) {
                return false;
            }
        }
        return true;
    }

}
