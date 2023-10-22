public class CasaEnemiga extends Casa {
    private Casa casaEnemiga;

    public CasaEnemiga(String nombre, int cantMaxDeAlumnosPermitida, Casa casa) {
        super(nombre, cantMaxDeAlumnosPermitida);
        this.casaEnemiga = casa;
    }

    @Override
    public boolean aceptaAlumno(Alumno al) {
        if ((super.aceptaAlumno(al)) &&
                (this.casaEnemiga.equals(al.getNombreCasa()) == false)) {
            return true;
        }
        return false;
    }

}
