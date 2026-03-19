package OO.SistemaDeTripulacaoPirata;

public class Missao {

    private String descricao, nivelPerigo;

    public Missao(String descricao, String nivelPerigo) {
        this.descricao = descricao;
        this.nivelPerigo = nivelPerigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getNivelPerigo() {
        return nivelPerigo;
    }
}
