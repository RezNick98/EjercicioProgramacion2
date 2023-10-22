package Ejercicio2;

public class Mueble {
    private final double PORCENTAJEAGREGADO=0.35;
    private double peso;
    private double precioFabricacion;
    private String tipoMadera;
    private String color;

    public Mueble(double peso, double precioFabricacion,
            String tipoMadera, String color) {
        this.peso = peso;
        this.precioFabricacion = precioFabricacion;
        this.tipoMadera = tipoMadera;
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrecioFabricacion() {
        return precioFabricacion;
    }

    public void setPrecioFabricacion(double precioFabricacion) {
        this.precioFabricacion = precioFabricacion;
    }

    public String getTipoMadera() {
        return tipoMadera;
    }

    public void setTipoMadera(String tipoMadera) {
        this.tipoMadera = tipoMadera;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecioVenta(){
        return this.precioFabricacion*PORCENTAJEAGREGADO;
    }

}
