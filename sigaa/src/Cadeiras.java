import java.util.ArrayList;
import java.util.List;

public class Cadeiras {
    private String materia;
    private String local;
    private String horario;
    List<Integer> notas = new ArrayList<Integer>();
    
    public Cadeiras(String materia, String local, String horario) {
        this.materia = materia;
        this.local = local;
        this.horario = horario;
       
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
    
}
