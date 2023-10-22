package Ejercicio3.Filtros;

import Ejercicio3.Planta;

public class FiltroNivelRiegoMayor extends Filtro{

    private int nivelRiegoMayorQue;

    

    public FiltroNivelRiegoMayor(int nivelRiegoMayorQue) {
        this.nivelRiegoMayorQue = nivelRiegoMayorQue;
    }



    @Override
    public boolean cumple(Planta p) {
        return p.getRiego()>nivelRiegoMayorQue;
    }
    
}
