package Ejercicio1;



public class Pelicula extends Item{
    private String infoPelicula;
    private int cantCopias;

    

    public Pelicula(String infoPelicula, int cantCopias) {
        this.infoPelicula = infoPelicula;
        this.cantCopias = cantCopias;
    }

    public String getInfoPelicula() {
        return infoPelicula;
    }

    public void setInfoPelicula(String infoPelicula) {
        this.infoPelicula = infoPelicula;
    }

    public int getCantCopias() {
        return cantCopias;
    }

    public void setCantCopias(int cantCopias) {
        this.cantCopias = cantCopias;
    }

    @Override
    public void devolvioItem() {
        this.cantCopias++;
    }

    @Override
    public void ponerEnAlquiler() {
        this.cantCopias--;
    }

    @Override
    public boolean puedeAlquilarse() {
        if(this.cantCopias>0){
            return true;
        }
        return false;
    }
}