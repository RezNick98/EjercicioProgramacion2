package Ejercicio5;

import java.time.LocalDate;

public class ProductoFresco extends Producto {

    public ProductoFresco(LocalDate fVencimiento, int nroLote, LocalDate fEnvasado, String granjaOrigen) {
        super(fVencimiento, nroLote, fEnvasado, granjaOrigen);

    }

    @Override
    public String etiqueta() {
        return "Producto Fresco [" + " fVencimiento: " + this.getfVencimiento() +
                " nroLote: " + this.getNroLote() + " fEnvasado: " + this.getfEnvasado() +
                "GranjaOrigen: " + this.getGranjaOrigen();
    }

}
