package arrays.DesafioMap;

public class Main {
    public static void main(String[] args) {

        RegistroNinja registro = new RegistroNinja();

        Ninja naruto = new Ninja("Naruto", "Genin", 9000);
        Ninja sasuke = new Ninja("Sasuke", "Genin", 8800);
        Ninja sakura = new Ninja("Sakura", "Chunin", 7200);
        Ninja kakashi = new Ninja("Kakashi", "Jonin", 9500);
        Ninja itachi = new Ninja("Itachi", "S", 9800);

        registro.mostrarNinjas();

        registro.adicionarNinja("N001", naruto);
        registro.adicionarNinja("N002", sasuke);
        registro.adicionarNinja("N003", sakura);
        registro.adicionarNinja("N004", kakashi);
        registro.adicionarNinja("N005", itachi);

        registro.buscarNinja("N001");
        registro.buscarNinja("N002");
        registro.buscarNinja("N005");

        registro.mostrarQuantidade();
        registro.mostrarNinjas();

        registro.removerNinja("N003");
        registro.buscarNinja("N003");

        registro.mostrarQuantidade();
        registro.mostrarNinjas();

    }
}
