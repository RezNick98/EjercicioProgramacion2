public class Main {
    public static void main(String[] args) {
        Empleado em1 = new Empleado("empleado", "lelelel", "lilili", 32, 1232, 600);
        Jerarquico j1 = new Jerarquico("Jerarquico", "lala", "lalal", 34, 12345, 6000);

        j1.addEmpleados(em1);
        System.out.println(j1);
        System.out.println(em1);
    }

}
