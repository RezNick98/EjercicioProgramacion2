package Ejercicio5;

import java.time.LocalDate;

import Ejercicio5.Filtros.*;

public class PlataformaMain {
    public static void main(String[] args) {
        Pelicula pel1=new Pelicula("peli1", "Lapeli1", "Carlito", LocalDate.ofYearDay(2013, 3), 130,18);
        Pelicula pel2=new Pelicula("peli2", "Lapeli2", "Carlito", LocalDate.ofYearDay(2015, 3), 100,13);
        Pelicula pel3=new Pelicula("luna", "Lapeli3", "scorsese", LocalDate.ofYearDay(2020, 3), 130,18);
        pel1.addActores("will smith");
        pel1.addGeneros("comedia");

        Filtro f1 = new FiltroActor("will smith");

        Filtro f2=new FiltroNot(new FiltroDirector("scorses"));

        Filtro f3= new FiltroAnd(f1, f2);
    }
    
}
