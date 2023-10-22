public class CasaExigente extends Casa {

    public CasaExigente(String nombre, int cantMaxDeAlumnosPermitida) {
        super(nombre, cantMaxDeAlumnosPermitida);

    }

    @Override
    public boolean aceptaAlumno(Alumno al) {
        if ((super.aceptaAlumno(al)) && (!al.getFamiliares().isEmpty())) {
            return true;
        }
        return false;
    }

}
