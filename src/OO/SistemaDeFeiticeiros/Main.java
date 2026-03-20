package OO.SistemaDeFeiticeiros;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== SISTEMA DE FEITICEIROS ===\n");

        // 🧾 Criando feiticeiros (polimorfismo)
        Feiticeiro f1 = new FeiticeiroOfensivo("Gojo", NivelFeiticeiro.ESPECIAL, 1000);
        Feiticeiro f2 = new FeiticeiroSuporte("Shoko", NivelFeiticeiro.GRAU_1, 600);
        Feiticeiro f3 = new FeiticeiroCorpoACorpo("Itadori", NivelFeiticeiro.SEMI_GRAU_1, 800);

        // 🧪 Testando técnicas (POLIMORFISMO)
        System.out.println("=== USO DE TÉCNICAS ===\n");

        f1.usarTecnica();
        System.out.println();

        f2.usarTecnica();
        System.out.println();

        f3.usarTecnica();
        System.out.println();

        // 📊 Testando informações básicas
        System.out.println("=== INFORMAÇÕES DOS FEITICEIROS ===\n");

        System.out.println("Nome: " + f1.getNome());
        System.out.println("Nível: " + f1.getNivel());
        System.out.println("Energia: " + f1.getEnergiaAmaldicoada());
        System.out.println("----------------------");

        System.out.println("Nome: " + f2.getNome());
        System.out.println("Nível: " + f2.getNivel());
        System.out.println("Energia: " + f2.getEnergiaAmaldicoada());
        System.out.println("----------------------");

        System.out.println("Nome: " + f3.getNome());
        System.out.println("Nível: " + f3.getNivel());
        System.out.println("Energia: " + f3.getEnergiaAmaldicoada());

        System.out.println("\n=== FIM DO SISTEMA ===");
    }
}
