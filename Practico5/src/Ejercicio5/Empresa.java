package Ejercicio5;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado> cantDeEmpleados;

    public Empresa() {
        this.cantDeEmpleados = new ArrayList<>();
    }

    public void addEmpleados(Empleado e) {
        this.cantDeEmpleados.add(e);
    }

    public ArrayList<Empleado> getEmpleados() {
        return new ArrayList<>(cantDeEmpleados);
    }

    public double calcularGastos() {
        double gastos = 0;
        for (int i = 0; i < cantDeEmpleados.size(); i++) {
            gastos += this.cantDeEmpleados.get(i).getSueldoMensual();
        }
        return gastos;
    }
}
