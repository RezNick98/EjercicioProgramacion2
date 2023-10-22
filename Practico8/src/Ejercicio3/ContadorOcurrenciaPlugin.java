package Ejercicio3;

import java.util.ArrayList;
import java.util.Arrays;

public class ContadorOcurrenciaPlugin implements Plugin{
    private String texto;
    private int cantOcurrencias;
    private String palabraDelUsuario;

    public ContadorOcurrenciaPlugin(String texto,String palabraDelUsuario){
        this.texto=texto;
        this.palabraDelUsuario=palabraDelUsuario;
    }

    public void setPalabraDelUsuario(String palabra){
        this.palabraDelUsuario=palabra;
    }

    @Override
    public void ejecutar() {
        ArrayList<String> palabras=new ArrayList<>(Arrays.asList(texto));
        for(int i=0;i<palabras.size();i++){
            if(palabras.get(i).contains(palabraDelUsuario)){
                cantOcurrencias++;
            }
        }
    }

    public int getCantOcurrencias(){
        return this.cantOcurrencias;
    }
    
}
