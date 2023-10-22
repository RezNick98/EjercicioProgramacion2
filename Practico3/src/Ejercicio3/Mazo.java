package Ejercicio3;

import java.util.ArrayList;

public class Mazo {
    private ArrayList<Personaje> personajes;

    public Mazo(ArrayList<Personaje> personajes){
        this.personajes=new ArrayList<>(personajes);
    }

    public void addPersonaje(Personaje personaje){
        this.personajes.add(personaje);
    }

    public ArrayList<Personaje> getPersonajes(){
        return personajes;
    }
}
