package OO.SistemaDeTripulacaoPirata;

public class Main {

    public static void main(String[] args) {

                System.out.println("=== SISTEMA DE TRIPULAÇÃO PIRATA ===\n");

                // ⚔️ Criando armas
                Arma espada = new Arma("Espadas", 90);
                Arma bastao = new Arma("Bastão", 60);
                Arma chute = new Arma("Chute", 85);
                Arma punhos = new Arma("Punhos", 80);

                // 🏴‍☠️ Criando piratas
                Pirata luffy = new Pirata("Luffy", punhos);
                Pirata zoro = new Pirata("Zoro", espada);
                Pirata nami = new Pirata("Nami", bastao);
                Pirata sanji = new Pirata("Sanji", chute);

                // 📜 Criando missões
                Missao m1 = new Missao("Invadir base da marinha", "S");
                Missao m2 = new Missao("Encontrar tesouro lendário", "A");
                Missao m3 = new Missao("Explorar ilha misteriosa", "B");

                // 🔗 Associando missões (1:N)
                luffy.adicionarMissao(m1);
                luffy.adicionarMissao(m2);

                zoro.adicionarMissao(m1);

                nami.adicionarMissao(m3);

                sanji.adicionarMissao(m2);

                // 🏴 Criando tripulações
                Tripulacao chapeuDePalha = new Tripulacao("Chapéu de Palha");
                Tripulacao alianca = new Tripulacao("Aliança Pirata");

                // 🔗 Relacionamento N:N
                chapeuDePalha.adicionarPirata(luffy);
                chapeuDePalha.adicionarPirata(zoro);
                chapeuDePalha.adicionarPirata(nami);
                chapeuDePalha.adicionarPirata(sanji);

                alianca.adicionarPirata(luffy);
                alianca.adicionarPirata(zoro);

                // 🧪 TESTES

                System.out.println("\n=== INFORMAÇÕES DOS PIRATAS ===\n");

                luffy.mostrarInfo();
                System.out.println("------------------");

                zoro.mostrarInfo();
                System.out.println("------------------");

                nami.mostrarInfo();
                System.out.println("------------------");

                sanji.mostrarInfo();

                // 📊 Testando tripulações
                System.out.println("\n=== TRIPULAÇÕES ===\n");

                System.out.println("Tripulação: " + chapeuDePalha.getNome());
                for (Pirata p : chapeuDePalha.getPiratas()) {
                    System.out.println("- " + p.getNome());
                }

                System.out.println("\nTripulação: " + alianca.getNome());
                for (Pirata p : alianca.getPiratas()) {
                    System.out.println("- " + p.getNome());
                }

                System.out.println("\n=== FIM DO SISTEMA ===");
    }
}
