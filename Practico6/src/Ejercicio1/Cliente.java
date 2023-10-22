package Ejercicio1;

import java.time.LocalDate;

public class Cliente{
    private String nombre;
    private Item itemAlquilado;
    private LocalDate fechaItemAlquilado;

    public Cliente(String nombre,Item itemAlquilado,
    LocalDate fechaItemAlquilado){
        this.nombre = nombre;
        this.itemAlquilado=itemAlquilado;
        this.fechaItemAlquilado=fechaItemAlquilado;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public Item getItemAlquilado() {
        return itemAlquilado;
    }

    public void setItemAlquilado(Item itemAlquilado) {
        this.itemAlquilado = itemAlquilado;
    }

    public LocalDate getFechaItemAlquilado() {
        return fechaItemAlquilado;
    }

    public void setFechaItemAlquilado(LocalDate fechaItemAlquilado) {
        this.fechaItemAlquilado = fechaItemAlquilado;
    }
    
}