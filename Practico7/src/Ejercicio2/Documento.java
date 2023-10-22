package Ejercicio2;

import java.util.ArrayList;

public class Documento {
    private String titulo,contenido;
    private ArrayList<String> listaAutores,palabarasClave;

    public Documento(String titulo,String contenido){
        this.titulo=titulo;
        this.contenido=contenido;
        this.listaAutores=new ArrayList<>();
        this.palabarasClave=new ArrayList<>();
    }

    public void addAutores(String autor){
        this.listaAutores.add(autor);
    }

    public void addPalabrasClave(String palabras){
        this.palabarasClave.add(palabras);
    }

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

    public void setContenido(String contenido){
        this.contenido=contenido;
    }

    public String getTitulo(){
        return this.titulo;
    }
    public String getContenido(){
        return this.contenido;
    }

    public ArrayList<String> getAutores(){
        return new ArrayList<>(listaAutores);
    }

    public ArrayList<String> getPalabrasClaves(){
        return new ArrayList<>(palabarasClave);
    }

}
