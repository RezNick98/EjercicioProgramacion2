package Ejercicio5.Filtros;

import Ejercicio5.SeguroSimple;

public class FiltroContienePalabra extends Filtro{

    private String palabraQueContiene;

    public FiltroContienePalabra(String palabraQueContiene){
        this.palabraQueContiene=palabraQueContiene;
    }

    public boolean cumple(SeguroSimple noticia){
        return noticia.getDescripcion().contains(palabraQueContiene);

    }
    
}
