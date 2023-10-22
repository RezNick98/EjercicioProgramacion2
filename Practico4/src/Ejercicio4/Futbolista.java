package Ejercicio4;

import java.time.LocalDate;

public class Futbolista extends Contingente {
    private String posicion, pieDominante;
    private int cantGoles;

    public Futbolista(String pieDominante, String posicion, int cantGoles, String nombre, String apellido,
            int nroPasaporte, LocalDate fNacimiento, String estado) {
        super(nombre, apellido, nroPasaporte, fNacimiento, estado);
        this.posicion = posicion;
        this.cantGoles = cantGoles;
        this.pieDominante = pieDominante;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getPieDominante() {
        return pieDominante;
    }

    public void setPieDominante(String pieDominante) {
        this.pieDominante = pieDominante;
    }

    public int getCantGoles() {
        return cantGoles;
    }

    public void setCantGoles(int cantGoles) {
        this.cantGoles = cantGoles;
    }

}
