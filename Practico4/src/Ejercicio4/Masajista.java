package Ejercicio4;

import java.time.LocalDate;

public class Masajista extends Contingente {

    private String titulo;
    private int cantAniosExperiencia;

    public Masajista(String titulo, int cantAniosExperiencia, String nombre, String apellido,
            int nroPasaporte, LocalDate fNacimiento, String estado) {
        super(nombre, apellido, nroPasaporte, fNacimiento, estado);
        this.cantAniosExperiencia = cantAniosExperiencia;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCantAnios() {
        return cantAniosExperiencia;
    }

    public void setCantAnios(int cantAnios) {
        this.cantAniosExperiencia = cantAnios;
    }

}
