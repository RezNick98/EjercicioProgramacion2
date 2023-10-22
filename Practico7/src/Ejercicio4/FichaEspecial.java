package Ejercicio4;

public class FichaEspecial extends Ficha{

    private int id;
    
    public FichaEspecial(int fortaleza,int espacioFicha,int poderDeDestruccion,String nombre,int id){
        super(fortaleza,espacioFicha,poderDeDestruccion,nombre);
        this.id=id;
    }

    
    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public double calcularPoderDeDestruccion(){
        return this.getFortaleza()/this.getEspacioFicha();
    }
}
