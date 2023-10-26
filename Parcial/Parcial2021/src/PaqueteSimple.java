import java.time.LocalDate;

public class PaqueteSimple extends ElementoViaje{
    public PaqueteSimple(int id, String datos, String ciudadOrigen, String ciudadDestino, LocalDate fPago, double costo,
            int cantMiembros) {
        super(id, datos, ciudadOrigen, ciudadDestino, fPago, costo, cantMiembros);
        
    }

    public int getId(){
        return this.id;
    }

    @Override
    public LocalDate getFechaPago() {
        return this.fPago;
    }

    @Override
    public String getCiudadOrigen() {
        return this.ciudadOrigen;
    }

    @Override
    public String getCiudadDestino() {
        return this.ciudadDestino;
    }

    @Override
    public int getCantMiembros() {
        return this.cantMiembros;
    }

    @Override
    public double getCosto() {
        return this.costo;
    }
}
