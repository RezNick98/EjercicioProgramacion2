public class Contribuyente {
    private String nombre;
    private int codigoId;
    private double montoFijo;

    public Contribuyente(String nombre, int codigoId, double montoFijo) {
        this.nombre = nombre;
        this.codigoId = codigoId;
        this.montoFijo = montoFijo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigoId() {
        return codigoId;
    }

    public void setCodigoId(int codigoId) {
        this.codigoId = codigoId;
    }

    public double getMonto() {
        return this.montoFijo;
    }
}
