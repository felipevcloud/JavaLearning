package OO.SistemaDeTripulacaoPirata;

import java.util.ArrayList;

public class Tripulacao {

    private String nome;
    private ArrayList<Pirata> listaDePiratas = new ArrayList<>();

    public Tripulacao(String nome) {
        this.nome = nome;
    }

    public void adicionarPirata(Pirata p) {
        System.out.println("Adicionando Pirata " + p.getNome() + " à tripulação " + this.nome);
        listaDePiratas.add(p);
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Pirata> getPiratas() {
        return listaDePiratas;
    }
}
