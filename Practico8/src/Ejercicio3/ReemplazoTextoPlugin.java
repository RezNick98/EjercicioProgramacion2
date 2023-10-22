package Ejercicio3;

public class ReemplazoTextoPlugin implements Plugin{
    private String texto;
    private String palabraARemplazar;

    public ReemplazoTextoPlugin(String texto,String palabraARemplazar){
        this.texto=texto;
        this.palabraARemplazar=palabraARemplazar;
    }

    

    @Override
    public void ejecutar() {
        texto=texto.replaceAll(texto, palabraARemplazar);

    }



    public String getPalabraARemplazar() {
        return palabraARemplazar;
    }



    public void setPalabraARemplazar(String palabraARemplazar) {
        this.palabraARemplazar = palabraARemplazar;
    }
    
}
