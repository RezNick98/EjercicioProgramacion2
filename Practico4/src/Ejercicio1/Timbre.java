package Ejercicio1;

public class Timbre {
    private String camapana;
    

    public Timbre(String campana) {
        this.camapana=campana;
    }

    public String hacerSonar(){
        return this.camapana;
    }

    public String getCamapana() {
        return camapana;
    }

    public void setCamapana(String camapana) {
        this.camapana = camapana;
    }
    
    
}
