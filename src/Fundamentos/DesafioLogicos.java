package Fundamentos;

import java.util.Scanner;

public class DesafioLogicos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean tuesday, thursday, bigTV, smallTV;

        System.out.println("Did you work on Tuesday? (true/false)");
        tuesday = Boolean.parseBoolean(input.next());

        System.out.println("Did you work on Thursday? (true/false)");
        thursday = Boolean.parseBoolean(input.next());

        bigTV = tuesday && thursday;
        smallTV = tuesday ^ thursday;

        if (bigTV){
            System.out.println("50' TV + Ice Cream");
        }
        if (smallTV){
            System.out.println("32' TV + Ice Cream");
        }
        if (!bigTV && !smallTV) {
            System.out.println("No TV, No Ice Cream");
        }
    }
}
