package Ejercicio4;

import java.util.ArrayList;

import Ejercicio4.Filtros.*;;

public class Seccion extends ElementoNoticia{
    private String descripcion;
    private String imagenAsociada;
    private ArrayList<ElementoNoticia> elementos;

    public Seccion(String descripcion,String imagenAsociada){
        this.descripcion=descripcion;
        this.imagenAsociada=imagenAsociada;
        this.elementos=new ArrayList<>();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void addElementos(ElementoNoticia e){
        if(!elementos.contains(e)){
            this.elementos.add(e);
        }
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagenAsociada() {
        return imagenAsociada;
    }

    public void setImagenAsociada(String imagenAsociada) {
        this.imagenAsociada = imagenAsociada;
    }

    @Override
    public int getCantidadaNoticias() {
        int contador=0;
        for (ElementoNoticia elementos : elementos) {
            contador+=elementos.getCantidadaNoticias();
        }
        return contador;
    }

    public ElementoNoticia getCopia(){
        Seccion copia= new Seccion(this.descripcion, this.imagenAsociada);
        for (ElementoNoticia elementoNoticia : this.elementos) {
            copia.addElementos(elementoNoticia);
        }
        return copia;
    }

    @Override
    public ArrayList<Noticia> getNoticiaRestringida(Filtro filtro) {
        ArrayList<Noticia> aux = new ArrayList<>();
        for (ElementoNoticia elementos : elementos) {
            aux.addAll(elementos.getNoticiaRestringida(filtro));
        }
        return aux;
    }

    
}
