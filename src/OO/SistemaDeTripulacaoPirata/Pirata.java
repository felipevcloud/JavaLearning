package OO.SistemaDeTripulacaoPirata;

import java.util.ArrayList;

public class Pirata {

    private String nome;
    private Arma arma;
    private ArrayList<Missao> listaDeMissoes = new ArrayList<>();

    public Pirata(String nome, Arma arma) {
        this.nome = nome;
        this.arma = arma;
    }

    public void adicionarMissao(Missao missao) {
        System.out.println("Adicionando " +  missao.getDescricao() + " Nível " +  missao.getNivelPerigo() + " para " + this.nome);
        this.listaDeMissoes.add(missao);
    }

    public void mostrarInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Arma: " + arma.getNome() + " - Dano: " + arma.getDano());
        System.out.println("Missões atribuídas: ");
        for (Missao missao : listaDeMissoes) {
            System.out.println(missao.getDescricao() + " - Nível: " + missao.getNivelPerigo());
        }
    }

    public String getNome() {
        return nome;
    }

}
