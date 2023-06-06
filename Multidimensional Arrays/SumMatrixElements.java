package MultidimensionalArrays_Lab;

import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] matrixSize = scanner.nextLine().split(", ");

        int numberOfRows = Integer.parseInt(matrixSize[0]);
        int numberOfCols = Integer.parseInt(matrixSize[1]);

        int[][] matrix = new int[numberOfRows][numberOfCols];


        for (int row = 0; row < numberOfRows; row++) {
            String[] rowOfMatrix = scanner.nextLine().split(", ");

            for (int col = 0; col < numberOfCols; col++) {
                matrix[row][col] = Integer.parseInt(rowOfMatrix[col]);
            }
        }
        int sum = 0;
        for (int row = 0; row < numberOfRows; row++) {
            for (int col = 0; col < numberOfCols; col++) {
                sum += matrix[row][col];
            }
        }
        System.out.println(numberOfRows);
        System.out.println(numberOfCols);
        System.out.println(sum);
    }
}
