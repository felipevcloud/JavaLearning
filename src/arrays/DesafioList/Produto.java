package arrays.DesafioList;

import java.util.Objects;

public class Produto {

    final String code;
    String name;
    int price;

    public Produto(String code, String name, int price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(code, produto.code);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(code);
    }
}
