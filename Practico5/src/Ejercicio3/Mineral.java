package Ejercicio3;

public class Mineral {
    private String nombreMineral;
    private boolean mineralPrimario;

    public Mineral(String nombreMineral) {
        this.nombreMineral = nombreMineral;
        this.mineralPrimario = false;
    }

    public String getNombreMineral() {
        return nombreMineral;
    }

    public void setNombreMineral(String nombreMineral) {
        this.nombreMineral = nombreMineral;
    }

    public boolean isMineralPrimario() {
        return mineralPrimario;
    }

    public void setMineralPrimario(boolean mineralPrimario) {
        this.mineralPrimario = mineralPrimario;
    }

}