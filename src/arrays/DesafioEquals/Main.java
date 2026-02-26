package arrays.DesafioEquals;

public class Main {
    public static void main(String[] args) {
        Produto [] products = {new Produto("001", "Teclado"), new Produto("002", "Mouse"),  new Produto("003", "Monitor"), new Produto("001", "Teclado Gamer"),  new Produto("004", "Cadeira")};

        for (int i = 0; i < products.length; i++) {
            for (int j = i + 1; j < products.length; j++) {
                if (products[i].equals(products[j])) {
                    System.out.println("Duplicado encontrado...");
                }
            }
        }
    }
}







