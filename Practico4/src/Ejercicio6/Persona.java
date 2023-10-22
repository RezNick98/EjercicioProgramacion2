public class Persona {
    private String cargo;
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String cargo, String nombre, String apellido, int edad) {
        this.cargo = cargo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona [cargo=" + cargo + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
    }

}
