package Ejercicio3.Filtros;

import Ejercicio3.Planta;

public class FiltroNivelSolMayor extends Filtro{

    private int nivelSolMayorQue;

    public FiltroNivelSolMayor(int nivelSolMayorQue){
        this.nivelSolMayorQue=nivelSolMayorQue;
    }

    @Override
    public boolean cumple(Planta p) {
        return p.getSol()>nivelSolMayorQue;
    }
    
}
