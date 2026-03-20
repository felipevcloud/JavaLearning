package OO.SistemaDeFeiticeiros;

public class FeiticeiroOfensivo extends Feiticeiro{

    public FeiticeiroOfensivo(String nome, NivelFeiticeiro nivel, int energiaAmaldicoada) {
        super(nome, nivel, energiaAmaldicoada);
    }

    @Override
    public void usarTecnica() {
        System.out.println(super.getNome() + " concentra energia amaldiçoada e lança um ataque destrutivo!");
    }
}
