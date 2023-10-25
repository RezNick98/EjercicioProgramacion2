package Ejercicio1;

public class OfertaLaboral {
    private int horasSemanales;
    private double montoOfrecido;
    private String empresaQueOferta;

    public OfertaLaboral(int horasSemanales,double montoOfrecido,String empresa){
        this.horasSemanales=horasSemanales;
        this.montoOfrecido=montoOfrecido;
        this.empresaQueOferta=empresa;
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }

    public double getMontoOfrecido() {
        return montoOfrecido;
    }

    public void setMontoOfrecido(double montoOfrecido) {
        this.montoOfrecido = montoOfrecido;
    }

    public String getEmpresaQueOferta() {
        return empresaQueOferta;
    }

    public void setEmpresaQueOferta(String empresaQueOferta) {
        this.empresaQueOferta = empresaQueOferta;
    }
     
}

