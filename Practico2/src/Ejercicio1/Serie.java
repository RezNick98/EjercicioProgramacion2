package Ejercicio1;

import java.util.ArrayList;

public class Serie {
    private String titulo;
    private String descripcion;
    private String creador;
    private String genero;
    private ArrayList<Temporada> temporadas;

    public Serie(String titulo, String descripcion, String creador, String genero, Temporada temporada) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.creador = creador;
        this.genero = genero;
        this.temporadas = new ArrayList<Temporada>(temporadas);
    }

    public void addTemporada(Temporada temporadas) {
        this.temporadas.add(temporadas);
    }

    public ArrayList<Temporada> getTemporada(){
        return temporadas;
    }

    public int getCantidadEpisodiosVistos(){
        int cant=0;
        for (int index = 0; index < temporadas.size(); index++) {
            cant=temporadas.get(index).cantEpisodiosVistos();    
            
        }
        return cant; 
    }


    public boolean vistoSerieCompleta(){
        for (int index = 0; index < temporadas.size(); index++) {
            if(!temporadas.get(index).temporadaVista()){
                return false;
            }
        }
        return true;
    }
}
