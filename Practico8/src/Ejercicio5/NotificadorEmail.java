package Ejercicio5;

public class NotificadorEmail implements Notificador{
    private String emailEnvio;
    private String emailRecepcion;
    public NotificadorEmail(String emailEnvio,String emailRecepcion){
        this.emailEnvio=emailEnvio;
        this.emailRecepcion=emailRecepcion;
    }

    @Override
    public void enviarNotificacion(String s) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'enviarNotificacion'");
    }

    @Override
    public String getNotificacion() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNotificacion'");
    }
    
}
