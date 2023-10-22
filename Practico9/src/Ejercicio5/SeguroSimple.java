package Ejercicio5;

public class SeguroSimple extends ElementoPoliza{
    private String descripcion;


    public SeguroSimple(int numeroPoliza, double montoPoliza,String descripcion,int dni) {
        super(numeroPoliza, montoPoliza, dni);
        this.descripcion=descripcion;
    }


    public String getDescripcion() {
        return descripcion;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    @Override
    public double getMonto() {
        return montoPoliza;
    }

    public int getNumeroPoliza(){
        return this.numeroPoliza;
    }
    
    
}
