package Ejercicio1;

public class Alarma {
    private boolean seRompioVentana;
    private boolean seAbrioPuertaOVentana;
    private boolean seDetectoMovimiento;

    public Alarma(){
        this.seRompioVentana=false;
        this.seAbrioPuertaOVentana=false;
        this.seDetectoMovimiento=false;
    }

    public boolean isSeRompioVentana() {
        return seRompioVentana;
    }

    public void setSeRompioVentana(boolean seRompioVentana) {
        this.seRompioVentana = seRompioVentana;
    }

    public boolean isSeAbrioPuertaOVentana() {
        return seAbrioPuertaOVentana;
    }

    public void setSeAbrioPuertaOVentana(boolean seAbrioPuertaOVentana) {
        this.seAbrioPuertaOVentana = seAbrioPuertaOVentana;
    }

    public boolean isSeDetectoMovimiento() {
        return seDetectoMovimiento;
    }

    public void setSeDetectoMovimiento(boolean seDetectoMovimiento) {
        this.seDetectoMovimiento = seDetectoMovimiento;
    }

    public boolean comprobar(){
        if(isSeAbrioPuertaOVentana() || isSeDetectoMovimiento() || isSeRompioVentana()){
            return true;
        }
        return false;
    }
}
