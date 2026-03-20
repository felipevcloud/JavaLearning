package OO.SistemaDeFeiticeiros;

public abstract class Feiticeiro {

    final private String nome;
    private NivelFeiticeiro nivel;
    private int energiaAmaldicoada;

    public Feiticeiro(String nome, NivelFeiticeiro nivel, int energiaAmaldicoada) {
        this.nome = nome;
        this.nivel = nivel;
        this.energiaAmaldicoada = energiaAmaldicoada;
    }

    public String getNome() {
        return nome;
    }

    public NivelFeiticeiro getNivel() {
        return nivel;
    }

    public int getEnergiaAmaldicoada() {
        return energiaAmaldicoada;
    }

    public abstract void usarTecnica();
}
