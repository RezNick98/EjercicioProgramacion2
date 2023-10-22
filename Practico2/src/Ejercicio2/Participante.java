package Ejercicio2;

public class Participante {
    private String mail;
    private int nroTelefono;
    public Participante(String mail, int nroTelefono) {
        this.mail = mail;
        this.nroTelefono = nroTelefono;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public int getNroTelefono() {
        return nroTelefono;
    }
    public void setNroTelefono(int nroTelefono) {
        this.nroTelefono = nroTelefono;
    }

    
}
