package MultidimensionalArrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] sizeOfMatrix = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(sizeOfMatrix[0]);
        int cols = Integer.parseInt(sizeOfMatrix[1]);

        int [][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            int[] rowOfMatrix = Arrays.
                    stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[row] = rowOfMatrix;

        }
        int searchedNumber = Integer.parseInt(scanner.nextLine());
        boolean weFoundIt = false;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (matrix[row][col] == searchedNumber) {
                    weFoundIt = true;
                    System.out.println(row + " " + col);
                }
            }
        }
        if (!weFoundIt){
            System.out.println("not found");
        }
    }
}
