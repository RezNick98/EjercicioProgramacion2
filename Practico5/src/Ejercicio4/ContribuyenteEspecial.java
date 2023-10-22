public class ContribuyenteEspecial extends Contribuyente {
    private double porcentajeMontoFijo;
    private double procetajeMontoFacturado;

    public ContribuyenteEspecial(String nombre, int codigoId, int montoFijo, double porcentajeMontoFijo,
            double procetajeMontoFacturado) {
        super(nombre, codigoId, montoFijo);
        this.porcentajeMontoFijo = porcentajeMontoFijo;
        this.procetajeMontoFacturado = procetajeMontoFacturado;
    }

    public double getPorcentajeMontoFijo() {
        return porcentajeMontoFijo;
    }

    public void setPorcentajeMontoFijo(double porcentajeMontoFijo) {
        this.porcentajeMontoFijo = porcentajeMontoFijo;
    }

    public double getProcetajeMontoFacturado() {
        return procetajeMontoFacturado;
    }

    public void setProcetajeMontoFacturado(double procetajeMontoFacturado) {
        this.procetajeMontoFacturado = procetajeMontoFacturado;
    }

    @Override
    public double getMonto() {
        double porcentajeAPagar = 0;
        porcentajeAPagar = (super.getMonto() * (getPorcentajeMontoFijo()
                + getProcetajeMontoFacturado())) / 100;
        return super.getMonto() + porcentajeAPagar;
    }
}
