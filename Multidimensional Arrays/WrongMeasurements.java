package MultidimensionalArrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfRows = Integer.parseInt(scanner.nextLine());

        int [][] wrongMatrix = new int[numberOfRows][];


        for (int row = 0; row < numberOfRows ; row++) {
            int[] rowOfMatrix = Arrays.
                    stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            wrongMatrix[row] = rowOfMatrix;
        }

        String[] coordinates = scanner.nextLine().split("\\s+");
        int rowCoordinates = Integer.parseInt(coordinates[0]);
        int colCoordinates = Integer.parseInt(coordinates[1]);

        int numberToReplace = wrongMatrix[rowCoordinates][colCoordinates];



                int [][] trueMatrix = new int[numberOfRows][wrongMatrix[0].length];

        for (int row = 0; row < numberOfRows; row++) {
            for (int col = 0; col < wrongMatrix[row].length; col++) {
                if (wrongMatrix[row][col] == numberToReplace){
                    int leftSide=0;
                    int rightSide=0;
                    int upSide=0;
                    int downSide=0;
                    if (row< wrongMatrix.length-1 && wrongMatrix[row+1][col] !=numberToReplace){
                        downSide = wrongMatrix[row+1][col];
                    }
                    if (row>0 && wrongMatrix[row-1][col] !=numberToReplace){
                        upSide=wrongMatrix[row-1][col];
                    }
                    if (col>0 && wrongMatrix[row][col-1] !=numberToReplace){
                        leftSide= wrongMatrix[row][col-1];
                    }
                    if (col<wrongMatrix[row].length-1 && wrongMatrix[row][col+1] !=numberToReplace){
                        rightSide = wrongMatrix[row][col+1];
                    }
                    trueMatrix[row][col]= downSide+upSide+rightSide+leftSide;
                }else {
                    trueMatrix[row][col]= wrongMatrix[row][col];
                }
            }
        }
        for (int row = 0; row < numberOfRows; row++) {
            for (int cols = 0; cols < trueMatrix[0].length; cols++) {
                System.out.print(trueMatrix[row][cols] + " ");
            }
            System.out.println();
        }

    }
}
