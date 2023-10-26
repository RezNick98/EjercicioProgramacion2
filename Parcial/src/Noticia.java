import java.util.ArrayList;

public class Noticia extends ElementoPortal{
    private String contenido;
    private String titulo;
    private String autor;
    private ArrayList<String> palabrasClaves;

    public Noticia(String contenido,String titulo,String autor,String categoria){
        super(categoria);
        this.contenido=contenido;
        this.titulo=titulo;
        this.autor=autor;
        this.palabrasClaves=new ArrayList<>();
    }

    

    public String getContenido() {
        return contenido;
    }



    public void setContenido(String contenido) {
        this.contenido = contenido;
    }



    public String getTitulo() {
        return titulo;
    }



    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }



    public String getAutor() {
        return autor;
    }



    public void setAutor(String autor) {
        this.autor = autor;
    }



    @Override
    public String getCategoria() {
        return this.categoria;
    }



    @Override
    public ArrayList<String> getPalabrasClaves() {
        return new ArrayList<>(palabrasClaves);
    }
}
