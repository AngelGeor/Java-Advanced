package MultidimensionalArrays_Ex;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseMatrixDiagonals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int rowsSize = Integer.parseInt(input[0]);
        int colsSize = Integer.parseInt(input[1]);

        int [][] matrix = new int[rowsSize][colsSize];

        for (int row = 0; row < rowsSize; row++) {
            int[] rowsOfMatrix = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[row] = rowsOfMatrix;

        }
        int row = rowsSize - 1;
        int col = colsSize - 1;

        while (row != -1){
            int r = row;
            int c = col;
            while (c < colsSize && r >= 0){
                System.out.print(matrix[r--][c++] + " ");
            }
            System.out.println();
            col--;
            if(col == -1){
                col = 0;
                row--;
            }
        }

    }
}
