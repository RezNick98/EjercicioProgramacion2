package Ejercicio3;

import java.util.ArrayList;
import java.util.Arrays;

public class ContadorPalabrasPlugin implements Plugin{
    private String texto;
    private int contadorPalabras;

    public ContadorPalabrasPlugin(String texto){
        this.texto=texto;
        this.contadorPalabras=0;
    }
    @Override
    public void ejecutar() {
        ArrayList<String> palabras = new ArrayList<>(Arrays.asList(texto.split("\\s+")));
        contadorPalabras=palabras.size();
    }

    public int ObtenerPalabras(){
        return this.contadorPalabras;
    }
    
}
