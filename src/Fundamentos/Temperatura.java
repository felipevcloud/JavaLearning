package Fundamentos;

public class Temperatura {
    public static void main(String[] args) {
        final int ADJUST = 32;
        final double FACTOR = 5.0/9.0;
        double fahrenheit = 86;
        double celsius = (fahrenheit - ADJUST) * FACTOR;
        System.out.println("Celsius = " + celsius + " °C.");
    }
}
