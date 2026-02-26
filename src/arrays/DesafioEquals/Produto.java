package arrays.DesafioEquals;

import java.util.Objects;

public class Produto {

    String code, name;


    public Produto(String code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(code, produto.code);
    }
}
