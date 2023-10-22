package Ejercicio1.Filtros;

import Ejercicio1.Enfermedad;
import Ejercicio1.ProductoQuimico;

public class CriterioEnfermedad extends Criterio{
    private Enfermedad enfermedad;

    public CriterioEnfermedad(Enfermedad enfermedad){
        this.enfermedad=enfermedad;
    }
    @Override
    public boolean cumple(ProductoQuimico p) {
        return p.trataEnfermedad(enfermedad);
    }
    
}
