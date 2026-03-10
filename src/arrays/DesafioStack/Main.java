package arrays.DesafioStack;

public class Main {

    public static void main(String[] args) {

        Editor editor = new Editor();

        editor.executarAcao(new Acao("Digitou Hello"));
        editor.executarAcao(new Acao("Mudou cor"));
        editor.executarAcao(new Acao("Apagou texto"));

        editor.mostrarHistorico();

        editor.desfazer();
        editor.desfazer();

        editor.mostrarHistorico();

        editor.desfazer();
        editor.desfazer();
        editor.mostrarHistorico();
    }

}
