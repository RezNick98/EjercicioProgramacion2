package Ejercicio3.Filtros;

import Ejercicio3.Mueble;

public class FiltroMaterial extends Filtro{
    private String materialABuscar;

    public FiltroMaterial(String materialABuscar){
        this.materialABuscar=materialABuscar;
    }

    @Override
    public boolean cumple(Mueble mueble) {
        return mueble.getMaterial().equals(materialABuscar);
    }


}
