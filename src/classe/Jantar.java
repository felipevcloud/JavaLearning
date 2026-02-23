package classe;

public class Jantar {

    public static void main(String[] args) {

        Pessoa felipe = new Pessoa("Felipe", 100.0);

        Comida lasagna = new Comida("Lasagna", 0.25);
        Comida iceCream = new Comida("Ice Cream", 0.5);

        System.out.printf("My name is %s and I weight %.2f\n", felipe.name, felipe.weight);

        felipe.comer(lasagna);
        System.out.printf("%s ate %s\n", felipe.name, lasagna.name);
        felipe.comer(iceCream);
        System.out.printf("%s ate %s\n", felipe.name, iceCream.name);

        System.out.printf("My name is %s and I weight %.2f\n", felipe.name, felipe.weight);
    }
}
