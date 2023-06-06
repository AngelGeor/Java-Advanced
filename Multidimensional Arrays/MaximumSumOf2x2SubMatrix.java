package MultidimensionalArrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2x2SubMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = (scanner.nextLine().split(", "));
        int rowsSize = Integer.parseInt(input[0]);
        int colsSize = Integer.parseInt(input[1]);

        int[] [] matrix = new int[rowsSize][colsSize];
        int maxSum = Integer.MIN_VALUE;
        int[][] subMatrix = new int[2][2];



        for (int row = 0; row < rowsSize; row++) {
            int[] rowOfMatrix = Arrays.
                    stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[row] = rowOfMatrix;
        }

        for (int row = 0; row < rowsSize - 1; row++) {
            for (int col = 0; col < colsSize - 1; col++) {
                int topLeft = matrix[row][col];
                int topRight = matrix[row][col + 1];
                int bottomLeft = matrix[row + 1][col];
                int bottomRight = matrix[row + 1][col + 1];
                int currentSum = topLeft + topRight + bottomLeft + bottomRight;
                if (currentSum > maxSum) {
                    subMatrix[0][0] = topLeft;
                    subMatrix[0][1] = topRight;
                    subMatrix[1][0] = bottomLeft;
                    subMatrix[1][1] = bottomRight;
                    maxSum = currentSum;
                }

            }
        }
        for (int row = 0; row < subMatrix.length; row++) {
            for (int cols = 0; cols < subMatrix.length; cols++) {
                System.out.print(subMatrix[row][cols] + " ");
            }
            System.out.println();
        }

        System.out.println(maxSum);
    }
}
