package OO.SistemaDeFeiticeiros;

public class FeiticeiroCorpoACorpo extends Feiticeiro{

    public FeiticeiroCorpoACorpo(String nome, NivelFeiticeiro nivel, int energiaAmaldicoada) {
        super(nome, nivel, energiaAmaldicoada);
    }

    @Override
    public void usarTecnica() {
        System.out.println(super.getNome() + " intensifica seus golpes com energia amaldiçoada e avança sem hesitar!");
    }
}
