package Ejercicio3;

public class Pastura extends Cereal {

    private int cantMinima;

    public Pastura(String nombreCereal, int cantMinima) {
        super(nombreCereal);
        this.cantMinima = cantMinima;
    }

    @Override
    public boolean sePuedeSembrar(Lote l1) {
        if (l1.getCantHectareas() >= this.cantMinima) {
            return true;
        }
        return false;
    }
}
