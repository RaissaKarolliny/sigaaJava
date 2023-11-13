import java.util.List;
import java.util.ArrayList;

public class Ficha {
    private int semestre;

    List <Cadeiras> cadeiras = new ArrayList<Cadeiras>();

    void adicionarCadeiras(Cadeiras o){
        cadeiras.add(o);
    }
    void listarCadeiras(){
        for (Cadeiras e : cadeiras) {
            System.out.println(e+"\n");
        }
    }
}
