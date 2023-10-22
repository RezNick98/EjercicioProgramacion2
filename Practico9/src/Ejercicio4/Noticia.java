package Ejercicio4;

import java.util.ArrayList;

import Ejercicio4.Filtros.Filtro;

public class Noticia extends ElementoNoticia{
    private String  titulo;
    private ArrayList<String> listadoPalabras;
    private String introduccion;
    private String texto;
    private String autor;
    private String linkAsociado;

    public Noticia(String titulo,String autor,String introduccion,String texto,String linkAsociado){
        this.titulo=titulo;
        this.introduccion=introduccion;
        this.texto=texto;
        this.linkAsociado=linkAsociado;
        this.listadoPalabras=new ArrayList<>();
        this.autor=autor;
    }

    public String getTitulo() {
        return titulo;
    }
    
    public void addPalabra(String palabra){
        if(!this.listadoPalabras.contains(palabra))
            this.listadoPalabras.add(palabra);
    }

    public boolean getPalabras(String palabra){
        return this.listadoPalabras.contains(palabra);
    }
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIntroduccion() {
        return introduccion;
    }

    public void setIntroduccion(String introduccion) {
        this.introduccion = introduccion;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getLinkAsociado() {
        return linkAsociado;
    }

    public void setLinkAsociado(String linkAsociado) {
        this.linkAsociado = linkAsociado;
    }

    public boolean equals(Object o){
        try {
            Noticia otro=(Noticia)o;
            return this.getTitulo().equals(otro.getTitulo()) 
            && this.getTexto().equals(otro.getTexto()) 
            && this.getAutor().equals(otro.getAutor());
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public int getCantidadaNoticias() {
        return 1;  
    }

    public Noticia getCopia(){
        return new Noticia(this.titulo, this.autor, this.introduccion, this.texto, this.linkAsociado);
    }


    @Override
    public String toString() {
        return "/" + linkAsociado + "";
    }

    @Override
    public ArrayList<Noticia> getNoticiaRestringida(Filtro filtro) {
        ArrayList<Noticia> aux = new ArrayList<>();
        if(filtro.cumple(this)){
            aux.add(this);
        }
        return aux;
    }

    

    

}
