package Ejercicio3.Filtros;

import Ejercicio3.Planta;

public class FiltroPlantaInterior extends Filtro{

    @Override
    public boolean cumple(Planta p) {
        return !p.isPlantaExterior();
    }
    
}
