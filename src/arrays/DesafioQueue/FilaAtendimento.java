package arrays.DesafioQueue;

import java.util.LinkedList;
import java.util.Queue;

public class FilaAtendimento {

    Queue<Pessoa> fila = new LinkedList<>();

    public void addPessoa(Pessoa pessoa) {
        fila.add(pessoa);
    }

    public void chamarProximo() {
        if (fila.isEmpty()) {
            System.out.println("Fila vazia");
        } else  {
            System.out.printf("Atendendo: %s%n", fila.poll().name);
        }
    }

    public void mostrarFila() {
        if (fila.isEmpty()) {
            System.out.println("Fila vazia");
        } else {
            System.out.println("Pessoas na fila:");
            for (Pessoa pessoa : fila) {
                System.out.println(pessoa.name);
            }
        }
    }

}
