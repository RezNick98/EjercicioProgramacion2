package Ejercicio1;

import java.util.ArrayList;

public class Empleado {
    private String nombre;
    private int sueldo;
    private ArrayList<Encuesta> encuestasRealizadas;

    public Empleado(String nombre, ArrayList<Encuesta> encuestas) {
        this.nombre = nombre;
        this.sueldo = 1000;
        this.encuestasRealizadas = new ArrayList<>(encuestas);
    }

    public Empleado(String nombre, int sueldo, ArrayList<Encuesta> encuestas) {
        this(nombre, encuestas);
        this.sueldo = sueldo;
    }

    public void addEncuesta(Encuesta encuesta) {
        this.encuestasRealizadas.add(encuesta);
    }

    public ArrayList<Encuesta> getEncuestas() {
        return this.encuestasRealizadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int calcularPlus() {
        int cantRealizadas = 0;
        for (int i = 0; i < encuestasRealizadas.size(); i++) {
            cantRealizadas = encuestasRealizadas.get(i).cantEncuestasRealizadasPorEmpleado(null);
        }
        return this.sueldo * cantRealizadas;
    }
}
