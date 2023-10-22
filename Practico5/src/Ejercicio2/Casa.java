import java.util.ArrayList;

public class Casa {
    private String nombre;
    private ArrayList<String> cualidadesNecesarias;
    private ArrayList<Alumno> alumnosDeLaCasa;
    private int cantMaxDeAlumnosPermitida;

    public Casa(String nombre, int cantMaxDeAlumnosPermitida) {
        this.nombre = nombre;
        this.cantMaxDeAlumnosPermitida = cantMaxDeAlumnosPermitida;
        this.cualidadesNecesarias = new ArrayList<>();
    }

    public void addCualidadNecesaria(String cualidad) {
        this.cualidadesNecesarias.add(cualidad);
    }

    public void addAlumnoDeLaCasa(Alumno al) {
        this.alumnosDeLaCasa.add(al);
    }

    public ArrayList<Alumno> getAlumnosDeLaCasa() {
        return new ArrayList<>(alumnosDeLaCasa);
    }

    public ArrayList<String> getCualidadesNecesarias() {
        return new ArrayList<>(cualidadesNecesarias);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantMaxDeAlumnosPermitida() {
        return cantMaxDeAlumnosPermitida;
    }

    public void setCantMaxDeAlumnosPermitida(int cantMaxDeAlumnosPermitida) {
        this.cantMaxDeAlumnosPermitida = cantMaxDeAlumnosPermitida;
    }

    public boolean aceptaAlumno(Alumno al) {
        if ((this.alumnosDeLaCasa.size() < cantMaxDeAlumnosPermitida)
                && (al.getCualidades().containsAll(this.cualidadesNecesarias))) {
            return true;
        }
        return false;
    }

}
