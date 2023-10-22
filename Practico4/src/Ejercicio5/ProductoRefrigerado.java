package Ejercicio5;

import java.time.LocalDate;

public class ProductoRefrigerado extends ProductoFresco {
    private int codigoOrganismo;
    private float tempMantenimiento;

    public ProductoRefrigerado(int codigoOrganismo, float tempMantenimiento,
            LocalDate fVencimiento, int nroLote, LocalDate fEnvasado, String granjaOrigen) {
        super(fVencimiento, nroLote, fEnvasado, granjaOrigen);
        this.codigoOrganismo = codigoOrganismo;
        this.tempMantenimiento = tempMantenimiento;
    }

    public void setCodigoOrganismo(int codigo) {
        this.codigoOrganismo = codigo;
    }

    public int getCodigoOrganismo() {
        return this.codigoOrganismo;
    }

    public float getTempMantenimiento() {
        return tempMantenimiento;
    }

    public void setTempMantenimiento(float tempMantenimiento) {
        this.tempMantenimiento = tempMantenimiento;
    }

    @Override
    public String etiqueta() {
        return "Producto [fVencimiento=" + getfVencimiento() + ", nroLote=" + getNroLote() + ", fEnvasado="
                + getfEnvasado()
                + ", granjaOrigen=" + getGranjaOrigen() +
                " codigoOrganismo: " + this.getCodigoOrganismo() +
                " tempMantenimiento " + this.getTempMantenimiento() + "]";
    }
}
