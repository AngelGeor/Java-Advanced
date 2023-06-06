package MultidimensionalArrays_Ex;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] matrixSize = scanner.nextLine().split("\\s+");

        int numberOfRows = Integer.parseInt(matrixSize[0]);
        int numberOfCols = Integer.parseInt(matrixSize[1]);

        int[][] matrix = new int[numberOfRows][numberOfCols];

        for (int row = 0; row < numberOfRows; row++) {
            int[] matrixRow = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[row] = matrixRow;
        }

        int maxSum = Integer.MIN_VALUE;
        int startingRow = 0;
        int startingCol = 0;

        for (int row = 0; row < numberOfRows - 2; row++) {
            for (int col = 0; col < numberOfCols - 2; col++) {
                int sum = matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2] +
                        matrix[row + 1][col] + matrix[row + 1][col + 1] + matrix[row + 1][col + 2] +
                        matrix[row + 2][col] + matrix[row + 2][col + 1] + matrix[row + 2][col + 2];

                if (sum > maxSum) {
                    maxSum = sum;
                    startingCol = col;
                    startingRow = row;
                }
            }
        }

        System.out.println("Sum = " + maxSum);

        for (int row = startingRow; row <= startingRow + 2; row++) {
            for (int col = startingCol; col <= startingCol + 2; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

    }
}
