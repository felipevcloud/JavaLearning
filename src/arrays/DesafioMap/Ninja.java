package arrays.DesafioMap;

public class Ninja {

    private final String nome;
    private String nivel;
    private int poder;

    public Ninja(String nome, String nivel, int poder) {
        this.nome = nome;
        this.nivel = nivel;
        this.poder = poder;
    }

    public String getNome() {
        return nome;
    }

    public String getNivel() {
        return nivel;
    }

    public int getPoder() {
        return poder;
    }
}
