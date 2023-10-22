package Ejercicio5;

import java.time.LocalDate;

public class Producto {
    private LocalDate fVencimiento;
    private int nroLote;
    private LocalDate fEnvasado;
    private String granjaOrigen;

    public Producto(LocalDate fVencimiento, int nroLote, LocalDate fEnvasado, String granjaOrigen) {
        this.fVencimiento = fVencimiento;
        this.nroLote = nroLote;
        this.fEnvasado = fEnvasado;
        this.granjaOrigen = granjaOrigen;
    }

    public LocalDate getfVencimiento() {
        return fVencimiento;
    }

    public void setfVencimiento(LocalDate fVencimiento) {
        this.fVencimiento = fVencimiento;
    }

    public int getNroLote() {
        return nroLote;
    }

    public void setNroLote(int nroLote) {
        this.nroLote = nroLote;
    }

    public LocalDate getfEnvasado() {
        return fEnvasado;
    }

    public void setfEnvasado(LocalDate fEnvasado) {
        this.fEnvasado = fEnvasado;
    }

    public String getGranjaOrigen() {
        return granjaOrigen;
    }

    public void setGranjaOrigen(String granjaOrigen) {
        this.granjaOrigen = granjaOrigen;
    }

    public String etiqueta() {
        return "Producto [fVencimiento=" + fVencimiento + ", nroLote=" + nroLote + "]";
    }

}
