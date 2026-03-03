package arrays.DesafioSet;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<Produto> products = new HashSet<>();

        products.add(new Produto("001", "Teclado"));
        products.add(new Produto("002", "Mouse"));
        products.add(new Produto("001", "Teclado Gamer"));
        products.add(new Produto("003", "Monitor"));

        System.out.println(products.size());
        System.out.println(products.contains(new Produto("002", "Mouse")));
        System.out.println(products.remove(new Produto("001", "Teclado Gamer")));
        System.out.println(products.size());

    }
}
