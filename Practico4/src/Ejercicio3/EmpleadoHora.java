package Ejercicio3;

public class EmpleadoHora extends Empleado {

    private int cantHorasTrabajadas;

    public EmpleadoHora(String nombre, double salario, int cantHorasTrabajadas) {
        super(nombre, salario);
        this.cantHorasTrabajadas = cantHorasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        return this.getSalario() + (this.cantHorasTrabajadas * 1.5);
    }

    public int getCantHorasTrabajadas() {
        return cantHorasTrabajadas;
    }

    public void setCantHorasTrabajadas(int cantHorasTrabajadas) {
        this.cantHorasTrabajadas = cantHorasTrabajadas;
    }

}
