import java.time.LocalDate;

public abstract class ElementoViaje {
    protected int id;
    protected String datos;
    protected String ciudadOrigen;
    protected String ciudadDestino;
    protected LocalDate fPago;
    protected double costo;
    protected int cantMiembros;

    public ElementoViaje(int id,String datos,String ciudadOrigen,String ciudadDestino,
    LocalDate fPago,double costo,int cantMiembros){
        this.id=id;
        this.datos=datos;
        this.ciudadOrigen=ciudadOrigen;
        this.ciudadDestino=ciudadDestino;
        this.fPago=fPago;
        this.costo=costo;
        this.cantMiembros=cantMiembros;
    }

    

    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }



    public String getDatos() {
        return datos;
    }



    public void setDatos(String datos) {
        this.datos = datos;
    }



    public abstract LocalDate getFechaPago();
    public abstract String getCiudadOrigen();
    public abstract String getCiudadDestino();
    public abstract int getCantMiembros();
    public abstract double getCosto();


}
