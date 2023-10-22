package Ejercicio1;

import java.util.ArrayList;

public class Videoclub{

    private ArrayList<Cliente> clientes;
    private ArrayList<Item> items;

    public Videoclub(){
        this.clientes = new ArrayList<>();
        this.items=new ArrayList<>();
    }

    public void addCliente(Cliente c){
        this.clientes.add(c);
    }

    public void addItem(Item it){
        this.items.add(it);
    }

    
}