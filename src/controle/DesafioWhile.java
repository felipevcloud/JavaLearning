package controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        double score = 0.0, total = 0.0;
        int counterScore = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Input a valid score (0.0 - 10.0): ");
        while (score != -1){
            score = input.nextDouble();
            if(score == -1){
                break;
            }
            else if (score >= 0.0 && score <= 10.0){
                total += score;
                counterScore++;
            } else  {
                System.out.print("Invalid Input!");
            }
            System.out.print("Input -1 to exit or Input a valid score (0.0 - 10.0): ");
        }

        System.out.printf("Total Score: %.2f\nNumber of Scores: %d\nMean: %.2f", total, counterScore, total/counterScore);

    }
}
