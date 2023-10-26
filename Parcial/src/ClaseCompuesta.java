import java.util.ArrayList;

public class ClaseCompuesta extends ElementoPortal{

    private ArrayList<ElementoPortal> elementos;
    private static String defecto;

    public ClaseCompuesta(String categoria) {
        super(categoria);
        this.elementos=new ArrayList<>();
        
    }


    @Override
    public String getCategoria() {
        for(int i=0;i<elementos.size();i++){
            return elementos.get(i).getCategoria();
        }
        return defecto;
        
    }


    @Override
    public ArrayList<String> getPalabrasClaves() {
        ArrayList<String> result=new ArrayList<>();
        for(int i=0;i<elementos.size();i++){
            ArrayList<String>aux = elementos.get(i).getPalabrasClaves();
            for(int j=0;j<aux.size();j++){
                if(!result.contains(aux)){
                    result.add(aux.get(i));
                }
            }
        }
        return result;
    }
    

}
