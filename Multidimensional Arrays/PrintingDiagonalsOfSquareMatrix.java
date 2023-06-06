package MultidimensionalArrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class PrintingDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sizeOfMatrix = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[sizeOfMatrix][sizeOfMatrix];

        for (int row = 0; row < sizeOfMatrix; row++) {
            int[] rowData = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[row] = rowData;
        }
        // Printirane na osnoven diagonal

        for (int i = 0; i < sizeOfMatrix; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();

        for (int col = 0; col < sizeOfMatrix; col++) {
            System.out.print(matrix[sizeOfMatrix - 1 - col][col] + " ");
        }
    }

}