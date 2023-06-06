package ExamPreparation;

import java.util.Scanner;

public class Bee_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rows = Integer.parseInt(scan.nextLine());
        char[][] matrix = new char[rows][rows];
        fillMatrix(scan, rows, matrix);

        int beeRow = getRow(matrix);
        int beeCol = getCol(matrix);

        int countPollinatedFlowers = 0;

        String command = scan.nextLine();
        while (!command.equals("End")) {
            boolean isOut = false;
            char field = matrix[beeRow][beeCol];
            matrix[beeRow][beeCol] = '.';

            switch (command) {
                case "up":
                    beeRow--;
                    if (isOut(beeRow, matrix)) {
                        isOut = true;
                        break;
                    }
                    field = matrix[beeRow][beeCol];

                    if (field == 'f') {
                        countPollinatedFlowers++;
                    } else if (field == 'O') {
                        matrix[beeRow][beeCol] = '.';
                        beeRow--;
                        if (matrix[beeRow][beeCol] == 'f') {
                            countPollinatedFlowers++;
                        }
                    }
                    break;
                case "down":
                    beeRow++;
                    if (isOut(beeRow, matrix)) {
                        isOut = true;
                        break;
                    }
                    field = matrix[beeRow][beeCol];

                    if (field == 'f') {
                        countPollinatedFlowers++;
                    } else if (field == 'O') {
                        matrix[beeRow][beeCol] = '.';
                        beeRow++;
                        if (matrix[beeRow][beeCol] == 'f') {
                            countPollinatedFlowers++;
                        }
                    }
                    break;
                case "left":
                    beeCol--;
                    if (isOut(beeCol, matrix)) {
                        isOut = true;
                        break;
                    }
                    field = matrix[beeRow][beeCol];

                    if (field == 'f') {
                        countPollinatedFlowers++;
                    } else if (field == 'O') {
                        matrix[beeRow][beeCol] = '.';
                        beeCol--;
                        if (matrix[beeRow][beeCol] == 'f') {
                            countPollinatedFlowers++;
                        }
                    }
                    break;
                case "right":
                    beeCol++;
                    if (isOut(beeCol, matrix)) {
                        isOut = true;
                        break;
                    }
                    field = matrix[beeRow][beeCol];

                    if (field == 'f') {
                        countPollinatedFlowers++;
                    } else if (field == 'O') {
                        matrix[beeRow][beeCol] = '.';
                        beeCol++;
                        if (matrix[beeRow][beeCol] == 'f') {
                            countPollinatedFlowers++;
                        }
                    }
                    break;
            }

            if (isOut) {
                break;
            }
            command = scan.nextLine();
        }

        if (!command.equals("End")) {
            System.out.println("The bee got lost!");
        } else {
            matrix[beeRow][beeCol] = 'B';
        }

        if (countPollinatedFlowers >= 5) {
            System.out.printf("Great job, the bee manage to pollinate %d flowers!%n", countPollinatedFlowers);
        } else {
            System.out.printf("The bee couldn't pollinate the flowers, she needed %d flowers more%n", 5 - countPollinatedFlowers);
        }
        printMatrix(matrix);
    }

    public static void printMatrix(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }

    private static boolean isOut(int row, char[][] matrix) {
        return row < 0 || row >= matrix.length;
    }

    private static void fillMatrix(Scanner scan, int size, char[][] matrix) {
        for (int row = 0; row < size; row++) {
            String line = scan.nextLine().replaceAll(" ", "");
            matrix[row] = line.toCharArray();
        }
    }

    private static int getRow(char[][] matrix) {
        int playerRow = -1;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col] == 'B') {
                    playerRow = row;
                }
            }
        }
        return playerRow;
    }

    private static int getCol(char[][] matrix) {
        int playerCol = -1;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col] == 'B') {
                    playerCol = col;
                }
            }
        }
        return playerCol;
    }
}


