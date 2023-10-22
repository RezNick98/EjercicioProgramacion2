package Ejercicio3;

public class Puerto {
    private ColaEspera barcos;
    private ColaEspera camiones;

    public Puerto(){
        this.barcos=new ColaEspera();
        this.camiones=new ColaEspera();
    }

    public void addCamiones(Camion c){
        this.camiones.addElemento(c);
    }

    public Camion descargarCamion(Barco b){
        if(camiones.tieneElemento()){
            Camion c1 =(Camion)camiones.siguiente();
            c1.descargarCamion();
            return c1;
        }else{
            barcos.addElemento(b);
            return null;
        }

    }
}