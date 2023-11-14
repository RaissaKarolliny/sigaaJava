import java.util.ArrayList;
import java.util.List;

public class Cronograma{
    private String lembrete;

    List<String> eventos = new ArrayList<String>();

    void adicionarLembrete(String data, String evento){
        lembrete = data + " " + evento ;
        eventos.add(lembrete);
    }

    void cronograma(){
        int i =1;
        System.out.println("Cronograma");
        for(String e : eventos){
          System.out.println( i + " " + e );
            i++;
        }
    }

    void removerLembrete(int i){
        eventos.remove(i-1);
    }
}