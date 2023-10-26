import java.util.ArrayList;

public abstract class ElementoPortal {
    protected String categoria;

    public ElementoPortal(String categoria){
        this.categoria=categoria;
    }
    public abstract String getCategoria();

    public abstract ArrayList<String> getPalabrasClaves();
}
