package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Empleado em1 = new Empleado("Eric", 1000);
        EmpleadoComision em2 = new EmpleadoComision("Fernando", 1000, 5);
        EmpleadoHora em3 = new EmpleadoHora("Martin", 1000, 5);
        Empresa empr1 = new Empresa();
        Empleado emp2 = new EmpleadoComision(null, 0, 0);
        System.out.println(em1.calcularSalario());
        System.out.println(em2.calcularSalario());
        System.out.println(em3.calcularSalario());
        empr1.addEmpleado(em1);
        empr1.addEmpleado(em2);
        empr1.addEmpleado(em3);

    }
}
