package Ejercicio5;

public class EmpleadoVentas extends Empleado {

    private int cantVentasDelMes;

    public EmpleadoVentas(int cantVentasDelMes, String nombre, String apellido, int dni, double sueldoMensual) {
        super(nombre, apellido, dni, sueldoMensual);
        this.cantVentasDelMes = cantVentasDelMes;
    }

    public int getCantVentasDelMes() {
        return cantVentasDelMes;
    }

    public void setCantVentasDelMes(int cantVentasDelMes) {
        this.cantVentasDelMes = cantVentasDelMes;
    }

    public double calcularSueldo() {
        double porcentaje = 0;
        porcentaje = this.getSueldoMensual() * (cantVentasDelMes / 100);
        return this.getSueldoMensual() + porcentaje;
    }

}
