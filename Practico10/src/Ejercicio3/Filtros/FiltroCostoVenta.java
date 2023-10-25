package Ejercicio3.Filtros;

import Ejercicio3.Mueble;

public class FiltroCostoVenta extends Filtro{
    private double costoVentaABuscar;

    public FiltroCostoVenta(double costo){
        this.costoVentaABuscar=costo;
    }

    public boolean cumple(Mueble mueble){
        return mueble.getCostoVenta()>costoVentaABuscar;
    }
    
}
