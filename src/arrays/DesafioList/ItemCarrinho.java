package arrays.DesafioList;

public class ItemCarrinho {

    Produto product;
    int quantity;

    public ItemCarrinho(Produto product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public ItemCarrinho add(int quantity) {
        this.quantity += quantity;
        return this;
    }
}