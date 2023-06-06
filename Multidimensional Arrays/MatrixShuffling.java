package MultidimensionalArrays_Ex;

import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dimensions = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);

        String[][] matrix = new String[rows][cols];

        fillMatrix(matrix, scanner);
        System.out.println();

        String command = scanner.nextLine();

        while (!command.equals("END")) {
            //1. Validirane na komanda!
            // Za da e validna trqbva purvo da zapochva sus "swap" i sled tova da ima 4 kordinata.
            if (!validateCommand(command, rows, cols)) {
                System.out.println("Invalid input!");
            } else { // ako komndata e validna
                //command -> "swap 0 0 1 1"
                String[] commandParts = command.split("\\s+");
                int row1 = Integer.parseInt(commandParts[1]);
                int col1 = Integer.parseInt(commandParts[2]);
                int row2 = Integer.parseInt(commandParts[3]);
                int col2 = Integer.parseInt(commandParts[4]);

                String firstElement = matrix[row1][col1];
                String secondElement = matrix[row2][col2];

                matrix[row1][col1] = secondElement;
                matrix[row2][col2] = firstElement;

                for (int row = 0; row < rows; row++) {
                    for (int col = 0; col < cols; col++) {
                        System.out.print(matrix[row][col] + " ");
                    }
                    System.out.println();
                }
            }

            command = scanner.nextLine();
        }
    }


    private static void fillMatrix(String[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split("\\s+");

        }
    }

    private static boolean validateCommand(String command, int numberOfRows, int numberOfCols) {
        //true -> ako komandatata e validna; //false -> ako e nevalidna
        String[] commandParts = command.split("\\s+");
        //1.Dali ima opredelen broi chasti (5) -> swap + 4 kordinata
        if (commandParts.length != 5) {
            return false;
        }
        //2.Dali komandata zapochva sus "swap"
        if (!commandParts[0].equals("swap")) {
            return false;
        }
        //3. Dali redovete i kolonite (indexite) sa validni
        int row1 = Integer.parseInt(commandParts[1]);
        int col1 = Integer.parseInt(commandParts[2]);
        int row2 = Integer.parseInt(commandParts[3]);
        int col2 = Integer.parseInt(commandParts[4]);

        if (row1 < 0 || row1 >= numberOfRows || row2 < 0 || row2 >= numberOfRows
                || col1 < 0 || col1 >= numberOfCols || col2 < 0 || col2 >= numberOfCols) {
            return false;
        }
        return true;
    }
}
