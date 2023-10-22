package Ejercicio5;

import java.time.LocalDate;

public class CongeladoPorAire extends ProductoFresco {
    private String composicionDelAire;

    public CongeladoPorAire(LocalDate fVencimiento, int nroLote, LocalDate fEnvasado, String granjaOrigen,
            String composicionDelAire) {
        super(fVencimiento, nroLote, fEnvasado, granjaOrigen);
        this.composicionDelAire = composicionDelAire;
    }

    public void setComposicionDelAire(String composicionDelAire) {
        this.composicionDelAire = composicionDelAire;
    }

    public String getComposicionDelAire() {
        return this.composicionDelAire;
    }

    public String etiqueta() {
        return "Producto congelado por nitrogeno:" + this.getfVencimiento() + this.getfEnvasado() +
                this.getNroLote() + this.getGranjaOrigen() + this.composicionDelAire;
    }
}
