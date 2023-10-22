import java.util.ArrayList;

public class Jerarquico extends Empleado {
    private ArrayList<Empleado> empleados;

    public Jerarquico(String cargo, String nombre, String apellido, int edad,
            int numeroLegajo, int sueldo) {
        super(cargo, nombre, apellido, edad, numeroLegajo, sueldo);
        this.empleados = new ArrayList<>();
    }

    public void addEmpleados(Empleado empleado) {
        this.empleados.add(empleado);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

}
