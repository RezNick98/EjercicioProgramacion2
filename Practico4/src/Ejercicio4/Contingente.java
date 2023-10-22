package Ejercicio4;

import java.time.LocalDate;

public class Contingente {
    private String nombre, apellido;
    private int nroPasaporte;
    private LocalDate fNacimiento;
    private String estado;

    public Contingente(String nombre, String apellido,
            int nroPasaporte, LocalDate fNacimiento, String estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nroPasaporte = nroPasaporte;
        this.fNacimiento = fNacimiento;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(LocalDate fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public boolean disponibleParaPartidoBenefico() {
        if (this.estado.equals("En pais de origen")) {
            return true;
        }
        return false;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNroPasaporte() {
        return this.nroPasaporte;
    }

}