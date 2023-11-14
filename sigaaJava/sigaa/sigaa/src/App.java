public class App {
    public static void main(String[] args) throws Exception {
        Cadeiras aed = new Cadeiras("aed", "sala 9", "10:00h");
        aed.adicionaNotas(4);
        Ficha semestre = new Ficha();
        semestre.adicionarCadeiras(aed);
        semestre.listarCadeiras();
        Cronograma a = new Cronograma();
        a.adicionarLembrete("27/11/2023","aula");
        a.adicionarLembrete("27","aula");
        a.cronograma();
    }
}
