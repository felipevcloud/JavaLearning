package arrays;

import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {

        int numberOfScores;
        double mean = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number of scores: ");
        numberOfScores = input.nextInt();

        double [] scores = new double[numberOfScores];

        for (int i = 0; i < numberOfScores; i++) {
            System.out.printf("Please enter score #%d: ", i + 1);
            scores[i] = input.nextDouble();
        }

        for (double score: scores) {
            mean += score;
        }

        System.out.printf("The mean is: %.2f", mean / numberOfScores);
    }
}
