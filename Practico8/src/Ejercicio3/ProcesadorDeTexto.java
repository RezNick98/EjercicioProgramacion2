package Ejercicio3;

public class ProcesadorDeTexto{ 
    private String textoActual;

    public ProcesadorDeTexto(String textoActual){
        this.textoActual=textoActual;
    }

    public void ejecutarPlugin(Plugin plugin){
        plugin.ejecutar();
    }

    public String getTextoActual() {
        return textoActual;
    }

    public void setTextoActual(String textoActual) {
        this.textoActual = textoActual;
    }

    
    
}
