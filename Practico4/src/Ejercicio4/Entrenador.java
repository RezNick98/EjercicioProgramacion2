package Ejercicio4;

import java.time.LocalDate;

public class Entrenador extends Contingente {
    private int idFederacion;

    public Entrenador(String nombre, String apellido, int nroPasaporte, LocalDate fNacimiento, String estado) {
        super(nombre, apellido, nroPasaporte, fNacimiento, estado);

    }

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }

}
