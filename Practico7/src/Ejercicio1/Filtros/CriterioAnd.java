package Ejercicio1.Filtros;

import Ejercicio1.ProductoQuimico;

public class CriterioAnd extends Criterio{
    private Criterio c1;
    private Criterio c2;

    public CriterioAnd(Criterio c1,Criterio c2){
        this.c1=c1;
        this.c2=c2;
    }

    @Override
    public boolean cumple(ProductoQuimico p) {
        return c1.cumple(p) && c2.cumple(p);
    }

}
