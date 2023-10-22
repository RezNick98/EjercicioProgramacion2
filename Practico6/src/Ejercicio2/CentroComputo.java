public class CentroComputo{
    private ColaEspera procesos;
    private ColaEspera computadoras;

    public CentroComputo(){
        this.computadoras=new ColaEspera();
        this.procesos = new ColaEspera();
    }

    public void agregarComputadora(Computadora c){
        this.computadoras.addElemento(c);
    }

    public Computadora agregarProcesos(Proceso p){
        if(computadoras.tieneElementos()){
            Computadora c1=(Computadora)computadoras.elementoSiguiente();
            c1.ejecutar();
            return c1;
        }else{
            procesos.addElemento(p);
            return null;
        }
    }
    
}
