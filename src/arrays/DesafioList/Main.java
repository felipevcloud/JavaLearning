package arrays.DesafioList;

public class Main {

    public static void main(String[] args) {

        Produto teclado = new Produto("001", "Teclado", 100);
        Produto mouse = new Produto("002", "Mouse", 50);

        Carrinho carrinho = new Carrinho();

        carrinho.addProduto(teclado, 2);
        carrinho.addProduto(mouse, 1);
        carrinho.addProduto(teclado, 1); // deve virar 3 teclados

        System.out.println("Total de itens: " + carrinho.getTotalItens());
        System.out.println("Valor total: " + carrinho.getValorTotal());

        carrinho.removeProduto(teclado); // agora deve ficar 2 teclados

        System.out.println("Após remover 1 teclado:");
        System.out.println("Total de itens: " + carrinho.getTotalItens());
        System.out.println("Valor total: " + carrinho.getValorTotal());

        carrinho.mostrarCarrinho();
    }
}