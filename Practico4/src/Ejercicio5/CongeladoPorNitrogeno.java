package Ejercicio5;

import java.time.LocalDate;

public class CongeladoPorNitrogeno extends ProductoFresco {
    private String metodoDeCongelacion;
    private float tiempoDeExposicionAlNitrogeno;

    public CongeladoPorNitrogeno(LocalDate fVencimiento, int nroLote, LocalDate fEnvasado, String granjaOrigen,
            String metodoDeCongelacion, float tiempoDeExposicionAlNitrogeno) {
        super(fVencimiento, nroLote, fEnvasado, granjaOrigen);
        this.metodoDeCongelacion = metodoDeCongelacion;
        this.tiempoDeExposicionAlNitrogeno = tiempoDeExposicionAlNitrogeno;
    }

    public float getTiempoDeExposicionAlNitrogeno() {
        return this.tiempoDeExposicionAlNitrogeno;
    }

    public String getMetodoDeCongelacion() {
        return this.metodoDeCongelacion;
    }

    public void setMetodoDeCongelacion(String metodoDeCongelacion) {
        this.metodoDeCongelacion = metodoDeCongelacion;
    }

    public void setTiempoDeExposicionAlNitrogeno(float tiempoDeExposicionAlNitrogeno) {
        this.tiempoDeExposicionAlNitrogeno = tiempoDeExposicionAlNitrogeno;
    }

    @Override
    public String etiqueta() {
        return "Producto congelado por nitrogeno:" + this.getfVencimiento() + this.getfEnvasado() +
                this.getNroLote() + this.getGranjaOrigen() + this.tiempoDeExposicionAlNitrogeno
                + this.metodoDeCongelacion;
    }
}
