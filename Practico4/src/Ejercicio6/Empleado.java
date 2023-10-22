public class Empleado extends Persona {
    private int numeroLegajo;
    private int sueldo;

    public Empleado(String cargo, String nombre, String apellido, int edad, int numeroLegajo, int sueldo) {
        super(cargo, nombre, apellido, edad);
        this.numeroLegajo = numeroLegajo;
        this.sueldo = sueldo;
    }

    public int getNumeroLegajo() {
        return numeroLegajo;
    }

    public void setNumeroLegajo(int numeroLegajo) {
        this.numeroLegajo = numeroLegajo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " Legajo: " + this.numeroLegajo + " Sueldo: " + this.sueldo;
    }

}
