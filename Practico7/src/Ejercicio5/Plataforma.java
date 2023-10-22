package Ejercicio5;

import java.util.ArrayList;

import Ejercicio5.Filtros.Filtro;


public class Plataforma {
    private ArrayList<Pelicula> peliculas;
    private Filtro esRentable;

    public Plataforma(Filtro esRentable){
        this.peliculas= new ArrayList<>();
        this.esRentable=esRentable;
    }

    public void addPelicula(Pelicula p){
        this.peliculas.add(p);
    }

    public ArrayList<Pelicula> buscarPorFiltro(Filtro f){
        ArrayList<Pelicula> aux=new ArrayList<>();

        for(int i=0;i<peliculas.size();i++){
            if(f.cumple(peliculas.get(i))){
                aux.add(peliculas.get(i));
            }
        }
        return aux;
    }

    public boolean determminarSiEsRentable(Pelicula p){
        if(esRentable.cumple(p)){
            return true;
        }
        return false;
    }

    public void setFiltro(Filtro f){
        this.esRentable=f;
    }
}
