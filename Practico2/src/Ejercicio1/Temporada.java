package Ejercicio1;


import java.util.ArrayList;

public class Temporada {
    private String nombre;
    private ArrayList<Episodio> episodios;


    public Temporada(Episodio episodio,String nombre){
        this.episodios=new ArrayList<Episodio>(episodios);
        this.nombre=nombre;
    }

    public void addEpisodio(Episodio episodio){
        this.episodios.add(episodio);
    }

    public ArrayList<Episodio> getEpisodios(){
        return episodios;
    }

    public int cantEpisodiosVistos(){
        int cant=0; //Almacena la cantidad de episodios vistos
        for(int i=0;i<episodios.size();i++){
            if(episodios.get(i).isFlag()==true){
                cant++;
            }
        }
        return cant;
    }

    public int getPromedioPorEpisodio(){
        int cont=0;
        int suma=0;
        for (int i = 0; i < episodios.size(); i++) {
            Episodio episodio = this.episodios.get(i); //Obtiene la calificacion de los episodios
            if(episodio.isFlag()){
                cont++;
                suma=episodio.getCalificacion();
            }
        }
        return suma/cont;
    }

    public boolean temporadaVista(){
        return this.episodios.size()==this.cantEpisodiosVistos();
    }
}
