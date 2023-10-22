package Ejercicio3;

import java.util.ArrayList;

public class Ciudad {
    private ArrayList<Impuesto> impuestos;
    private int cantHabitantes;
    private String nombre;
    private int gastosCiudad;

    public Ciudad(ArrayList<Impuesto> impuestos, int cantHabitantes, String nombre, int gastosCiudad) {
        this.impuestos = new ArrayList<>(impuestos);
        this.cantHabitantes = cantHabitantes;
        this.nombre = nombre;
        this.gastosCiudad = gastosCiudad;
    }

    public boolean gastaMasDeLoQueRecauda() { //Determina que ciudades gastan mas de lo que recaudan
        int montoTotalImpuestos = 0;
        for (int i = 0; i < impuestos.size(); i++) {
            montoTotalImpuestos = impuestos.get(i).montoTotal();
        }
        if (montoTotalImpuestos < this.getGastosCiudad()) {
            return true;
        }
        return false;
    }

    public ArrayList<Impuesto> getImpuestos() {
        return impuestos;
    }

    public int getCantHabitantes() {
        return cantHabitantes;
    }

    public String getNombre() {
        return nombre;
    }

    public int getGastosCiudad() {
        return gastosCiudad;
    }

    public void addImpuestos(Impuesto impuesto) {
        this.impuestos.add(impuesto);
    }

}
