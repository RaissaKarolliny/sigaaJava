public class Cronograma{
    private String lembrete = "Cronograma \n";

    void adicionarLembrete(String data, String evento){
        lembrete += data + evento +  "\n";
    }

    void cronograma(){
        System.out.println(lembrete);
    }
}