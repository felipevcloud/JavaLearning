package Fundamentos;

public class DesafioAritmeticos {
    public static void main(String[] args) {

        double dividendA = Math.pow((6 * (3 + 2)), 2)/(3 * 2);
        double dividendB = Math.pow((((1 - 5) * (2 - 7))/ 2), 2);
        double divisor = Math.pow(10, 3);

        int fraction = (int) (Math.pow(dividendA - dividendB, 3)/divisor);

        System.out.println("Result: " + fraction);
    }
}
