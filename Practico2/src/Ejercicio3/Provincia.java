package Ejercicio3;

import java.util.ArrayList;

public class Provincia {
    private ArrayList<Ciudad> ciudades;
    private final int MAXHABITANTES=100000;

    public Provincia(ArrayList<Ciudad> ciudades) {
        this.ciudades = new ArrayList<>();
    }

    public void addCiudad(Ciudad ciudad) {
        this.ciudades.add(ciudad);
    }

    public ArrayList<Ciudad> getCiudades() {
        return this.ciudades;
    }

    public int CiudadGrande() { // Calcula la cantidad de ciudades con mas de 1000000 habitantes
        int cantCiudades = 0;
        for (int i = 0; i < ciudades.size(); i++) {
            if (ciudades.get(i).getCantHabitantes()>=MAXHABITANTES) {
                cantCiudades++;
            }

        }
        return cantCiudades;
    }

    public boolean masDeLaMitadEnDeficit() { //Calcula cuantas ciudades conmas de 1000000 habitantes tienen deficit
        int cont=0;
        for (int i = 0; i < ciudades.size(); i++) {
            if(ciudades.get(i).gastaMasDeLoQueRecauda()){
                cont++;
            }
        }
        if(cont>this.CiudadGrande()/2){
            return true;
        }else{
            return false;
        }
    }
}