package Ejercicio1;

import java.time.LocalDate;

public class Alquiler {
    private Cliente cliente;
    private LocalDate fechaLimite;
    private Item item;
    private boolean loDevolvio;

    public Alquiler(Cliente clienet,LocalDate fechaLimite,Item item){
        this.cliente=cliente;
        this.fechaLimite=fechaLimite;
        this.item=item;
        this.loDevolvio=false;
    }

    public boolean alquilerVencido(){
        LocalDate hoy = LocalDate.now();
        if(this.fechaLimite.isBefore(hoy) && !loDevolvio){
            return true;
        }
        return false;
    }

    public void clienteDevolvioItem(){
        this.loDevolvio=true;
        this.item.devolvioItem();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(LocalDate fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public boolean isLoDevolvio() {
        return loDevolvio;
    }

    public void setLoDevolvio(boolean loDevolvio) {
        this.loDevolvio = loDevolvio;
    }

    
}
