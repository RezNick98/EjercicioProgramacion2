package Ejercicio3.Filtros;

import Ejercicio3.Planta;

public class FiltroNivelRiegoMenor extends Filtro{
    private int nivelRiegoMenorQue;

    

    public FiltroNivelRiegoMenor(int nivleRiegoMenorQue) {
        this.nivelRiegoMenorQue = nivelRiegoMenorQue;
    }

    @Override
    public boolean cumple(Planta p) {
        return p.getRiego()<nivelRiegoMenorQue;
    }
    
}
