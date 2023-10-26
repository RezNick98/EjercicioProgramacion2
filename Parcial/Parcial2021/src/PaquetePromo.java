import java.time.LocalDate;

public class PaquetePromo extends ClaseCompuesta{

    private double descuento;
    private LocalDate inicioFechaPromo;
    private LocalDate finFechaPromo;

    public PaquetePromo(int id, String datos, String ciudadOrigen, String ciudadDestino, LocalDate fPago, double costo,
            int cantMiembros,double descuento,LocalDate inicioFechaPromo,LocalDate finFechaPromo) {
        super(id, datos, ciudadOrigen, ciudadDestino, fPago, costo, cantMiembros);
        this.descuento=descuento;
        this.inicioFechaPromo=inicioFechaPromo;
        this.finFechaPromo=finFechaPromo;
    }

    
    public LocalDate getInicioFechaPromo() {
        return inicioFechaPromo;
    }


    public void setInicioFechaPromo(LocalDate inicioFechaPromo) {
        this.inicioFechaPromo = inicioFechaPromo;
    }


    public LocalDate getFinFechaPromo() {
        return finFechaPromo;
    }


    public void setFinFechaPromo(LocalDate finFechaPromo) {
        this.finFechaPromo = finFechaPromo;
    }


    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    @Override
    public int getId(){
        return this.id;
    }
    @Override
    public LocalDate getFechaPago(){
        return this.fPago;
    }

    @Override
    public double getCosto(){
        if((this.fPago.isAfter(inicioFechaPromo)) && (this.fPago.isBefore(finFechaPromo))){
            return this.costo * descuento;
        }else{
            return this.costo;
        }
    }

    
}
