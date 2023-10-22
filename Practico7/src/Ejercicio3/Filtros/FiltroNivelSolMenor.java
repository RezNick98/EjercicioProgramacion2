package Ejercicio3.Filtros;

import Ejercicio3.Planta;

public class FiltroNivelSolMenor extends Filtro{
    private int nivelSolMenorQue;

    public FiltroNivelSolMenor(int nivelSolMenorQue){
        this.nivelSolMenorQue=nivelSolMenorQue;
    }

    @Override
    public boolean cumple(Planta p) {
        return p.getSol()<nivelSolMenorQue;
    }
    
}
