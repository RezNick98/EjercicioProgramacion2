import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private ArrayList<String> conjuntosDeCualidades;
    private ArrayList<String> nombreFamiliares;
    private Casa nombreCasa;

    public Alumno(String nombre, Casa nombreCasa) {
        this.nombre = nombre;
        this.conjuntosDeCualidades = new ArrayList<>();
        this.nombreFamiliares = new ArrayList<>();
        this.nombreCasa = nombreCasa;
    }

    public void addFamiliar(String familiar) {
        this.nombreFamiliares.add(familiar);
    }

    public void addCualidad(String cualidad) {
        this.conjuntosDeCualidades.add(cualidad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getCualidades() {
        return new ArrayList<>(conjuntosDeCualidades);
    }

    public ArrayList<String> getFamiliares() {
        return new ArrayList<>(nombreFamiliares);
    }

    public Casa getNombreCasa() {
        return nombreCasa;
    }

    public void setNombreCasa(Casa nombreCasa) {
        this.nombreCasa = nombreCasa;
    }

}
