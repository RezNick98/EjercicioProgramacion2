package Ejercicio1.Filtros;

import Ejercicio1.OfertaLaboral;

public class FiltroEmpresa extends Filtro{
    private String empresaABuscar;

    public FiltroEmpresa(String empresaABuscar){
        this.empresaABuscar=empresaABuscar;
    }

    public boolean cumple(OfertaLaboral oferta){
        return oferta.getEmpresaQueOferta().equals(empresaABuscar);
    }
}
