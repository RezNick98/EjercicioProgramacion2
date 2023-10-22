package Ejercicio3.Filtro;

import Ejercicio3.Voto;

public class FiltroVotoBlanco extends Filtro{


    @Override
    public boolean cumple(Voto mesa) {
       if(mesa.getCandidatoAElegir()==null){
        return true;
       }
       return false;
    }
    
}
