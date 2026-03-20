package OO.SistemaDeFeiticeiros;

public class FeiticeiroSuporte extends Feiticeiro{

    public FeiticeiroSuporte(String nome, NivelFeiticeiro nivel, int energiaAmaldicoada) {
        super(nome, nivel, energiaAmaldicoada);
    }

    @Override
    public void usarTecnica() {
        System.out.println(super.getNome() + " ativa uma técnica de suporte, restaurando energia e aumentando o poder do grupo!");
    }
}
