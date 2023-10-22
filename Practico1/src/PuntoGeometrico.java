public class PuntoGeometrico {
    private double x;
    private double y;

    public PuntoGeometrico(){
        this.x=0;
        this.y=0;
    }

    public PuntoGeometrico(double x,double y){
        this.x=x;
        this.y=y;
    }

    public void desplazarPunto(double x,double y){
        this.x=this.x+x;
        this.y=this.y+y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double calcularDistanciaEuclidea(PuntoGeometrico p1,PuntoGeometrico p2){
        return Math.sqrt((p1.getX()-p2.getX())*(p1.getX()-p2.getX())+(p1.getY()-p2.getY())*(p1.getY()-p2.getY()));
    }

    
}
