package Ejercicio3.Filtro;

import Ejercicio3.Voto;


public class FiltroCandidato extends Filtro{
    private String candidatoABuscar;

    @Override
    public boolean cumple(Voto mesa) {
        return this.candidatoABuscar.equals(mesa.getCandidatoAElegir());
    }
    
}
