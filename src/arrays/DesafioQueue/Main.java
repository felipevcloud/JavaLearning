package arrays.DesafioQueue;

public class Main {
    public static void main(String[] args) {
        FilaAtendimento fila = new FilaAtendimento();

        fila.addPessoa(new Pessoa("Felipe"));
        fila.addPessoa(new Pessoa("João"));
        fila.addPessoa(new Pessoa("Maria"));

        fila.mostrarFila();

        fila.chamarProximo();
        fila.chamarProximo();

        fila.mostrarFila();
    }
}
