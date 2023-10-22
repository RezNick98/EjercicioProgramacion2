public class Electrodomestico {
    private final double BAJOCONSUMO=45;
    private final double ALTAGAMA=3;
    private String nombre;
    private double precioBase;
    private String color;
    private double consumo;
    private double peso;

    public Electrodomestico(String nombre){
        this.color="gris plata";
        this.nombre=nombre;
        this.consumo=10;
        this.precioBase=100;
        this.peso=2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean bajoConsumo(){
        return this.consumo<BAJOCONSUMO;
    }

    public double balance(){
        return this.precioBase/this.peso;
    }

    public boolean altaGama(){
        return this.balance()>ALTAGAMA;
    }
}
