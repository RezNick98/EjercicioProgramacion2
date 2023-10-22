package Ejercicio2;

import java.util.ArrayList;

public class Fabrica {
    private ArrayList<Mueble> productos;
    private boolean productosEnStock;

    public Fabrica(ArrayList<Mueble> productos,boolean productosEnStock){
        this.productos=new ArrayList<>(productos);
        this.productosEnStock=productosEnStock;
    }

    public void addProductos(Mueble producto){
        this.productos.add(producto);
    }

    public boolean isProductosEnStock() {
        return productosEnStock;
    }

    public void setProductosEnStock(boolean productosEnStock) {
        this.productosEnStock = productosEnStock;
    }

    
}
