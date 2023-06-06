package MultidimensionalArrays_Ex;

import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int matrixSize = Integer.parseInt(input[0]);
        String type = input[1];

        int[][] matrix = new int[matrixSize][matrixSize];

        if(type.equals("A")){
            fillInMatrixByA(matrix);

        }else if(type.equals("B")){
           fillInMatrixByB(matrix);

        }

        for (int row = 0; row < matrixSize; row++) {
            for (int col = 0; col < matrixSize; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

    }

    private static void fillInMatrixByB(int[][] matrix) {
        int startNumber = 1;
        for (int col = 0; col < matrix.length ; col++) {
            if (col % 2 == 0){
                for (int row = 0; row < matrix.length; row++) {
                   matrix[row][col] = startNumber;
                   startNumber ++;
                }
            }else {
                for (int row = matrix.length - 1; row >= 0 ; row--) {
                matrix[row][col] = startNumber;
                startNumber++;
                }

            }
        }

    }

    private static void fillInMatrixByA(int[][] matrix) {
        int startingNumber = 1;
        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][col] = startingNumber;
                startingNumber++;
            }
        }

    }
}
