package Ejercicio1;



public class Vehiculo extends Item{

    private enum combustionVehiculo{Diesel,Naftero,Electrico};

    private String marca;
    private double kms;
    private String patente;
    private combustionVehiculo combustion;
    private boolean estaAlquilado;

    

    public Vehiculo(String marca, double kms, String patente, combustionVehiculo combustion) {
        this.marca = marca;
        this.kms = kms;
        this.patente = patente;
        this.combustion = combustion;
        this.estaAlquilado=false;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getKms() {
        return kms;
    }

    public void setKms(double kms) {
        this.kms = kms;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public combustionVehiculo getCombustion() {
        return combustion;
    }
    

    public void setCombustion(combustionVehiculo combustion) {
        this.combustion = combustion;
    }

    public boolean isEstaAlquilado() {
        return estaAlquilado;
    }

    public void setEstaAlquilado(boolean estaAlquilado) {
        this.estaAlquilado = estaAlquilado;
    }
    @Override
    public void devolvioItem() {
        this.estaAlquilado=false;
    }

    @Override
    public void ponerEnAlquiler() {
        this.estaAlquilado=true;
    }

    @Override
    public boolean puedeAlquilarse() {
        if(this.estaAlquilado==false){
            return true;
        }
        return false;
    }


    

    
}
