import java.time.LocalDate;
import java.util.ArrayList;

public class ClaseCompuesta extends ElementoViaje{
    private ArrayList<ElementoViaje> elementos;


    public ClaseCompuesta(int id, String datos, String ciudadOrigen, String ciudadDestino, LocalDate fPago,
            double costo, int cantMiembros) {
        super(id, datos, ciudadOrigen, ciudadDestino, fPago, costo, cantMiembros);
        this.elementos=new ArrayList<>();
    }


    @Override
    public LocalDate getFechaPago() {
        int i=0;
        LocalDate fAux=null;
        LocalDate fMax=null;
        while(i<elementos.size()){
            fAux=elementos.get(i).getFechaPago();
            if(fMax.isAfter(fAux)){
                fMax=fAux;
                i++;
            }else{
                i++;
            }
        }
        return fMax;
    }

    @Override
    public String getCiudadOrigen() {
        return elementos.get(0).ciudadOrigen;
    }

    @Override
    public String getCiudadDestino() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCiudadDestino'");
    }

    @Override
    public int getCantMiembros() {
        int cantMax=0;
        for (ElementoViaje elementoViaje : elementos) {
            cantMax = elementoViaje.cantMiembros;
        }
        return cantMax;
    }

    @Override
    public double getCosto() {
        double resultado=0;
        for(int i=0;i<elementos.size();i++){
            resultado +=elementos.get(i).getCosto();
        }
        return resultado;
    }

    @Override
    public int getId(){
        return this.id;
    }

    public void addElemento(ElementoViaje elemento){
        if(!this.elementos.contains(elemento)){
            this.elementos.add(elemento);
        }
    }
}
