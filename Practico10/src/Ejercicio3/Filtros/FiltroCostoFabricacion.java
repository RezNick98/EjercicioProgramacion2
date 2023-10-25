package Ejercicio3.Filtros;

import Ejercicio3.Mueble;

public class FiltroCostoFabricacion extends Filtro{
    private double costoFabricacionABuscar;

    public FiltroCostoFabricacion(double costo){
        this.costoFabricacionABuscar=costo;
    }

    public boolean cumple(Mueble mueble){
        return mueble.getCostoFabricacion()<costoFabricacionABuscar;
    }
}
