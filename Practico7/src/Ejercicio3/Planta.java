package Ejercicio3;

public class Planta {
    private String nombreCientifico;
    private String nombreVulgar;
    private String clasificacion;
    private String familia;
    private String clase;
    private int riego;
    private int sol;
    private boolean plantaExterior;
    public Planta(String nombreCientifico, String nombreVulgar, String clasificacion, String familia, String clase,
            int riego, int sol) {
        this.nombreCientifico = nombreCientifico;
        this.nombreVulgar = nombreVulgar;
        this.clasificacion = clasificacion;
        this.familia = familia;
        this.clase = clase;
        this.riego = riego;
        this.sol = sol;
        this.plantaExterior=false;
    }
    public String getNombreCientifico() {
        return nombreCientifico;
    }
    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }
    public String getNombreVulgar() {
        return nombreVulgar;
    }
    public void setNombreVulgar(String nombreVulgar) {
        this.nombreVulgar = nombreVulgar;
    }
    public String getClasificacion() {
        return clasificacion;
    }
    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
    public String getFamilia() {
        return familia;
    }
    public void setFamilia(String familia) {
        this.familia = familia;
    }
    public String getClase() {
        return clase;
    }
    public void setClase(String clase) {
        this.clase = clase;
    }
    public int getRiego() {
        return riego;
    }
    public void setRiego(int riego) {
        this.riego = riego;
    }
    public int getSol() {
        return sol;
    }
    public void setSol(int sol) {
        this.sol = sol;
    }
    public boolean isPlantaExterior() {
        return plantaExterior;
    }
    public void setPlantaExterior(boolean plantaExterior) {
        this.plantaExterior = plantaExterior;
    }

    

    
}
