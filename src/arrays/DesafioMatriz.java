package arrays;

import java.util.Scanner;

public class DesafioMatriz {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrix;
        int N, sumDiagonal = 0, sumReverseDiagonal = 0;

        System.out.print("Please type the number of rows and columns of the matrix: ");
        N = input.nextInt();
        matrix = new int[N][N];

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.printf("Please type matrix[%d][%d] value: ", row, column);
                matrix[row][column] = input.nextInt();
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            sumDiagonal += matrix[i][i];
        }

        for (int i = 0; i < matrix.length; i++) {
            sumReverseDiagonal += matrix[i][matrix.length - 1 - i];
        }

        System.out.printf("The Diagonal sum is: %d\nAnd the Reverse Diagonal sum is: %d",  sumDiagonal, sumReverseDiagonal);
    }
}
