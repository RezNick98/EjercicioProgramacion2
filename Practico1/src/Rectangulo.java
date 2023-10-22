public class Rectangulo {
    private PuntoGeometrico punto1;
    private PuntoGeometrico punto2;

    public Rectangulo(){
        this.punto1=new PuntoGeometrico();
        this.punto2=new PuntoGeometrico();
    }

    public void trasladarRectangulo(double valor){
        this.punto1.desplazarPunto(valor, valor);
        this.punto2.desplazarPunto(valor, valor);
    }

    public double calcularArea(){
        return (Math.abs(this.punto1.getX()-this.punto2.getX())*Math.abs((this.punto1.getY()
        -this.punto2.getY())));
    }
    public int compararRectangulo(Rectangulo rectanguloComp){
        if(this.calcularArea()>rectanguloComp.calcularArea()){
            return 1;
        }else if(this.calcularArea()<rectanguloComp.calcularArea()){
            return -1;
        }else{
            return 0;
        }
    }

        public boolean determinarSiEsCuadrado(){
            if(Math.abs(this.punto1.getX()-this.punto2.getX())==
            Math.abs(this.punto1.getY()-this.punto2.getY())){
                return true;
            }
            return false;
        }

        public double determinarLargoLadoSuperior(){
            if(Math.abs(this.punto1.getX()-this.punto2.getX())>(Math.abs(this.punto1.getY()-this.punto2.getY()))){
                return (this.punto1.getX()-this.punto2.getX());
            }
            return (this.punto1.getY()-this.punto2.getY());
        }

        public String determinarPosicion(){
            if(Math.abs(this.punto1.getX()-this.punto2.getX())>(Math.abs(this.punto1.getY()-this.punto2.getY()))){
                return "Acostado";
            }else if((Math.abs(this.punto1.getX()-this.punto2.getX())<(Math.abs(this.punto1.getY()-this.punto2.getY())))){
                return "Parado";
            }
            return "Cuadrado";
        }
}
