package arrays.DesafioList;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    List<ItemCarrinho> carrinho = new ArrayList<>();

    public void addProduto(Produto produto, int quantidade) {
        for (ItemCarrinho item : this.carrinho) {
            if (produto.equals(item.product)) {
                item.quantity += quantidade;
                return;
            }
        }
        carrinho.add(new ItemCarrinho(produto, quantidade));
    }

    public void removeProduto(Produto produto)
    {
        for (int i = 0; i < carrinho.size(); i++) {

            ItemCarrinho item = carrinho.get(i);

            if (produto.equals(item.product)) {

                if (item.quantity > 1) {
                    item.quantity--;
                } else {
                    carrinho.remove(i);
                }

                return;
            }
        }
    }

    public int getTotalItens()
    {
        int total = 0;
        for (ItemCarrinho item : this.carrinho)
        {
            total += item.quantity;
        }
        return total;
    }

    public int getValorTotal()
    {
        int total = 0;
        for (ItemCarrinho item : carrinho)
        {
            total += item.product.price * item.quantity;
        }
        return total;
    }

    public void mostrarCarrinho()
    {
        for (ItemCarrinho item : carrinho)
        {
            System.out.println(item.product.name);
        }
    }
}
