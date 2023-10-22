package Ejercicio3;

public class EmpleadoComision extends Empleado {
    private int cantVentasRealizadas;

    public EmpleadoComision(String nombre, int salario, int cantVentasRealizadas) {
        super(nombre, salario);
        this.cantVentasRealizadas = cantVentasRealizadas;
    }

    @Override
    public double calcularSalario() {
        return this.getSalario() + (this.cantVentasRealizadas * 0.5);
    }

    public int getCantVentasRealizadas() {
        return cantVentasRealizadas;
    }

    public void setCantVentasRealizadas(int cantVentasRealizadas) {
        this.cantVentasRealizadas = cantVentasRealizadas;
    }

}
