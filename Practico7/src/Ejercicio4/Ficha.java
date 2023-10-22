package Ejercicio4;

public class Ficha {
    private int fortaleza;
    private int espacioFicha;
    private int poderDeDestruccion;
    private String nombre;

    public Ficha(int fortaleza,int espacioFicha,int poderDeDestruccion,String nombre){
        this.fortaleza=fortaleza;
        this.espacioFicha=espacioFicha;
        this.poderDeDestruccion=poderDeDestruccion;
        this.nombre=nombre;
    }

    public int getFortaleza() {
        return fortaleza;
    }

    public void setFortaleza(int fortaleza) {
        this.fortaleza = fortaleza;
    }

    public int getEspacioFicha() {
        return espacioFicha;
    }

    public void setEspacioFicha(int espacioFicha) {
        this.espacioFicha = espacioFicha;
    }

    public int getPoderDeDestruccion() {
        return poderDeDestruccion;
    }

    public void setPoderDeDestruccion(int poderDeDestruccion) {
        this.poderDeDestruccion = poderDeDestruccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
