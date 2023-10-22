package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Alarma al1=new Alarma();
        Timbre t1=new Timbre(null);
        Luz l1=new Luz(null);

        l1.setLuz("Encendiendo luces");
        t1.setCamapana("RINGGGGGG");
        al1.setSeAbrioPuertaOVentana(true);
        if(al1.comprobar()==true){
            System.out.println(t1.hacerSonar());
            System.out.println(l1.encender());
        }else{
            System.out.println("Nada que hacer");
        }
    }
}
