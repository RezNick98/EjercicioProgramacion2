package Ejercicio3;

public class Personaje {
    private String nombreReal;
    private String nombreSuper;
    private int visionNocturna, fuerza, velocidad, edad;
    private double peso, altura;

    public Personaje(String nombreReal, String nombreSuper,
            int visionNocturna, int fuerza, int velocidad, int edad,
            double peso, double altura) {
                this.nombreReal=nombreReal;
                this.nombreSuper=nombreSuper;
                this.visionNocturna=visionNocturna;
                this.fuerza=fuerza;
                this.velocidad=velocidad;
                this.edad=edad;
                this.peso=peso;
                this.altura=altura;
    }

    

    public String getNombreReal() {
        return nombreReal;
    }

    public void setNombreReal(String nombreReal) {
        this.nombreReal = nombreReal;
    }

    public String getNombreSuper() {
        return nombreSuper;
    }

    public void setNombreSuper(String nombreSuper) {
        this.nombreSuper = nombreSuper;
    }

    public int getVisionNocturna() {
        return visionNocturna;
    }

    public void setVisionNocturna(int visionNocturna) {
        this.visionNocturna = visionNocturna;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    
}
