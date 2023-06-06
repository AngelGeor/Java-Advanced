package Exam19_02;

import java.util.Scanner;

public class PawnWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] chessField = new char[8][8];
        for (int row = 0; row < chessField.length; row++) {
            char[] chessFieldRow = scanner.nextLine().toCharArray();
            chessField[row] = chessFieldRow;
        }

        int blackRow = -1;
        int blackCol = -1;
        int whiteRow = -1;
        int whiteCol = -1;

        for (int row = 0; row < chessField.length; row++) {
            for (int col = 0; col < chessField.length; col++) {
                if (chessField[row][col] == 'w') {
                    whiteRow = row;
                    whiteCol = col;
                } else if (chessField[row][col] == 'b') {
                    blackRow = row;
                    blackCol = col;
                }
            }
        }

        while (true) {
            if (chessField[whiteRow][whiteCol] != 'b') {
                if (whiteRow - 1 > 0) {
                    if (whiteRow - 1 == blackRow && whiteCol - 1 == blackCol || whiteRow - 1 == blackRow && whiteCol + 1 == blackCol) {
                        whiteRow = blackRow;
                        whiteCol = blackCol;
                        System.out.printf("Game over! White capture on %s.", getCoordinates(whiteRow, whiteCol));
                        break;
                    } else {
                        whiteRow--;
                    }
                } }
                else {
                    whiteRow--;
                    System.out.printf("Game over! White pawn is promoted to a queen at %s.", getCoordinates(whiteRow, whiteCol));
                    break;
                }

            if (chessField[blackRow][blackCol] != 'w') {
                if (blackRow + 1 < chessField.length) {
                    if (blackRow + 1 == whiteRow && blackCol + 1 == whiteCol || blackRow + 1 == whiteRow && blackCol - 1 == whiteCol) {
                        blackRow = whiteRow;
                        blackCol = whiteCol;
                        System.out.printf("Game over! Black capture on %s.", getCoordinates(blackRow, blackCol));
                        break;
                    } else {
                        blackRow++;
                    }
                }
            }else {
                    System.out.printf("Game over! Black pawn is promoted to a queen at %s.", getCoordinates(blackRow, blackCol));
                    break;
                }
            }

    }

    private static String getCoordinates(int row, int col) {
        String[][] matrix = new String[8][8];
        int counter = 9;
        int symbol = 97;
        for (int rows = 0; rows < matrix.length; rows++) {
            counter--;
            symbol = 97;
            for (int cols = 0; cols < matrix.length; cols++) {
                matrix[rows][cols] = (char) symbol + "" + counter;
                symbol++;
            }
        }
        return matrix[row][col];
    }

}
