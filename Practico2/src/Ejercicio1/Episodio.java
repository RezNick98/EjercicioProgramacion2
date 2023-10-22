package Ejercicio1;

public class Episodio {
    private String titulo;
    private String descripcion;
    private boolean flag;
    private int calificacion;

    public Episodio(String titulo,String descripcion,boolean flag,int calificacion){
        this.titulo=titulo;
        this.descripcion=descripcion;
        this.flag=flag;
        this.calificacion=calificacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public void agregarCalificacion(int c){
        if((this.calificacion<1) || (calificacion>5)){
            this.calificacion=-1;
        }else{
            this.calificacion=c;
        }
    }


    
}
