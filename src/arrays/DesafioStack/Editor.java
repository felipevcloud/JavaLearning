package arrays.DesafioStack;

import java.util.Stack;

public class Editor {

    Stack<Acao> history = new Stack<>();

    public void executarAcao(Acao acao) {
        System.out.println("Executando: " + acao.description);
        history.push(acao);
    }

    public void desfazer(){
        if (history.isEmpty()){
            System.out.println("Nada para desfazer");
        } else {
            System.out.println("Desfazendo: " + history.peek().description);
            history.pop();
        }
    }

    public void mostrarHistorico(){
        if (history.isEmpty()) {
            System.out.println("Stack Vazia");
        } else {
            System.out.println("Actions on Stack:");
            for (Acao acao : history) {
                System.out.println(acao.description);
            }
        }
    }
}
