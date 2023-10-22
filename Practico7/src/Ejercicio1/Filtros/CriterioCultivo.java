package Ejercicio1.Filtros;

import Ejercicio1.Cultivo;
import Ejercicio1.ProductoQuimico;

public class CriterioCultivo extends Criterio{
    private Cultivo cultivo;

    public CriterioCultivo(Cultivo cultivo){
        this.cultivo=cultivo;
    }

    @Override
    public boolean cumple(ProductoQuimico p) {
        if(!p.getCultivosDesaconsejados().equals(cultivo)){
            return true;
        }
        return false;
    }


}
