package Ejercicio3;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado> empleados;

    public Empresa() {
        this.empleados = new ArrayList<>();
    }

    public void addEmpleado(Empleado empleado) {
        this.empleados.add(empleado);
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

}
