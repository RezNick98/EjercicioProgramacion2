package Ejercicio3;

import java.util.ArrayList;
import java.util.Arrays;

public class EliminarPalabraPlugin implements Plugin{
    private String texto;
    private String palabraAEliminar;

    public EliminarPalabraPlugin(String texto,String palabraAEliminar){
        this.texto=texto;
        this.palabraAEliminar=palabraAEliminar;
    }

    @Override
    public void ejecutar() {
        texto=texto.replaceAll("\\b"+palabraAEliminar+"\\b", "");
    }

    public String getTextoModificdo(){
        return texto;
    }
    
}
