public class Computadora extends ElementoCola{
    private int id;
    private int velocidadCPU;
    public Computadora(int id,int velocidadCPU){
        this.id=id;
        this.velocidadCPU=velocidadCPU;
        }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getVelocidadCPU() {
        return velocidadCPU;
    }
    public void setVelocidadCPU(int velocidadCPU) {
        this.velocidadCPU = velocidadCPU;
    }


    @Override
    public boolean esMayor(ElementoCola otro) {
        return this.getVelocidadCPU()>((Computadora)otro).getVelocidadCPU();
    }

    public void ejecutar(){
        System.out.println("Ejecutando");
    }


}
