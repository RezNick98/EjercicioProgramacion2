package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        String texto = "Este es un ejemplo de texto para contar palabras";
        ProcesadorDeTexto procesador = new ProcesadorDeTexto(texto);

        ContadorPalabrasPlugin contadorPlugin = new ContadorPalabrasPlugin(texto);
        ContadorOcurrenciaPlugin ocurrenciaPlugin = new ContadorOcurrenciaPlugin(texto, "es");

        procesador.ejecutarPlugin(contadorPlugin);

        int conteoPalabras = contadorPlugin.ObtenerPalabras();

        System.out.println("El conteo de palabras es: " + conteoPalabras);

        procesador.ejecutarPlugin(ocurrenciaPlugin);
        int conteoDeOcurrencias = ocurrenciaPlugin.getCantOcurrencias();

        System.out.println("La cantidad de ocurrencias son: "+conteoDeOcurrencias);

        System.out.println("Texto original: "+texto);

        EliminarPalabraPlugin eliminarPalabra = new EliminarPalabraPlugin(texto, "es");
        
        procesador.ejecutarPlugin(eliminarPalabra);

        String textoModificado = eliminarPalabra.getTextoModificdo();

        System.out.println("Texto con el plugin eliminar: "+textoModificado);
    }
}
