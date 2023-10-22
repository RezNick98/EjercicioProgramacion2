package Ejercicio5;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pelicula {
    private String titulo;
    private String sinopsis;
    private ArrayList<String> generos;
    private String director;
    private ArrayList<String> actores;
    private LocalDate anioEstreno;
    private double duracion;
    private int PG;
    public Pelicula(String titulo, String sinopsis, String director, LocalDate anioEstreno, double duracion, int pG) {
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.director = director;
        this.anioEstreno = anioEstreno;
        this.duracion = duracion;
        PG = pG;
        this.generos=new ArrayList<>();
        this.actores=new ArrayList<>();
    }

    public void addGeneros(String genero){
        this.generos.add(genero);
    }

    public void addActores(String actor){
        this.actores.add(actor);
    }

    public ArrayList<String> getActores(){
        return new ArrayList<>(actores);
    }

    public ArrayList<String> getgeneros(){
        return new ArrayList<>(generos);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getAnioEstreno() {
        return anioEstreno;
    }

    public void setAnioEstreno(LocalDate anioEstreno) {
        this.anioEstreno = anioEstreno;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public int getPG() {
        return PG;
    }

    public void setPG(int pG) {
        PG = pG;
    }

    
    
    
}
