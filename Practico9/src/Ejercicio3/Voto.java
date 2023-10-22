package Ejercicio3;

import java.util.ArrayList;

import Ejercicio3.Filtro.Filtro;

public class Voto extends ElementoElectoral{
    private Candidato candidatoAElegir;
    private int dni;

    public Voto(Candidato candidatoAElegir,int dni){
        this.candidatoAElegir=candidatoAElegir;
        this.dni=dni;
    }

    

    public Candidato getCandidatoAElegir() {
        return candidatoAElegir;
    }

    public int getDni(){
        return this.dni;
    }


    public void setCandidatoAElegir(Candidato candidatoAElegir) {
        this.candidatoAElegir = candidatoAElegir;
    }

    public boolean equals(Object o){
        try {
            Voto otro=(Voto)o;
            return this.getDni()==otro.getDni();
        } catch (Exception e) {
            return false;
        }
    }



    @Override
    public int getCantVotosPorFiltro(Filtro f) {
        if(f.cumple(this)){
            return 1;
        }else{

            return 0;
        }

    }



    @Override
    public int getCantTotalDeVotos() {
        return 1;


    }

}
