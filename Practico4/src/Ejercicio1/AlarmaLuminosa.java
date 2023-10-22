package Ejercicio1;

public class AlarmaLuminosa extends Alarma{

    public boolean comprobarAlarma(){
        if(super.comprobar()){
            return true;
        }
        return false;
    }
    
}
