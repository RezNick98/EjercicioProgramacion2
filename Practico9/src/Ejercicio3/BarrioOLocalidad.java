package Ejercicio3;

import java.util.ArrayList;

import Ejercicio3.Filtro.Filtro;

public class BarrioOLocalidad extends ElementoElectoral{
    private ArrayList<ElementoElectoral> elementos;

    public BarrioOLocalidad(){
        this.elementos=new ArrayList<>();
    }

    @Override
    public int getCantVotosPorFiltro(Filtro f) {
        int contador=0;
        for (ElementoElectoral elementoElectoral : elementos) {
            contador+=elementoElectoral.getCantVotosPorFiltro(f);
        }
        return contador;
    }

    @Override
    public int getCantTotalDeVotos() {
        int contador=0;
        for (ElementoElectoral elemento : elementos) {
            contador+=elemento.getCantTotalDeVotos();
        }
        return contador;
    }
}
