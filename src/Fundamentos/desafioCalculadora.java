package Fundamentos;

import java.util.Scanner;

public class desafioCalculadora {
    public static void main(String[] args) {

        int firstValue, secondValue, result;
        String operation;
        Scanner input = new Scanner(System.in);

        System.out.print("First Value: ");
        firstValue = input.nextInt();
        System.out.print("Second Value: ");
        secondValue = input.nextInt();
        System.out.print("Operation (+ | - | * | / | %): ");
        operation = input.next();

        result = operation.equals("+") ? firstValue + secondValue : 0;
        result = operation.equals("-") ? firstValue - secondValue : result;
        result = operation.equals("*") ? firstValue * secondValue : result;
        result = operation.equals("/") ? firstValue / secondValue : result;
        result = operation.equals("%") ? firstValue % secondValue : result;

        System.out.printf("Operation Result is: %d", result);

    }
}
