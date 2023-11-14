import java.util.ArrayList;
import java.util.List;

public class Cadeiras {
    private String materia;
    private String local;
    private String horario;
    private float total = 0;
    private float media;

    List<Integer> notas = new ArrayList<Integer>();
    
    public Cadeiras(String materia, String local, String horario) {
        this.materia = materia;
        this.local = local;
        this.horario = horario;
       
    }

    void adicionaNotas(int o){
        notas.add(o);
    }
    void calculaMedia(){
        for(Integer o: notas){
            total += o;
        }
        media = total / notas.size();

    }

    void listarNotas(){
        for(Integer o: notas){
        System.out.println(o + "\n");
        }
    }

    public String getMateria() {
        return materia;
    }
    public void setMateria(String materia) {
        this.materia = materia;
    }
    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public List<Integer> getNotas() {
        return notas;
    }
    public void setNotas(List<Integer> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Cadeiras: \n materia:" + materia + ", local:" + local + ", horario: " + horario + ", notas: " + notas + "\n";
    }
    
}