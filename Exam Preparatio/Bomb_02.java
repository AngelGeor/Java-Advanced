package ExamPreparation;

import java.util.Scanner;

public class Bomb_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        String[] commands = scanner.nextLine().split(",");
        char[][] matrix = new char[size][size];
        boolean noMoreBombs = false;
        boolean theEnd = false;

        for (int row = 0; row < size; row++) {
            char[] matrixRow = scanner.nextLine().replaceAll(" ", "").toCharArray();
            matrix[row] = matrixRow;
        }
        int currentRow = -1;
        int currentCol = -1;
        int bombs = 0;

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (matrix[row][col] == 's') {
                    currentRow = row;
                    currentCol = col;
                }
                if (matrix[row][col] == 'B') {
                    bombs++;
                }
            }
        }
        for (int i = 0; i < commands.length; i++) {
            String currentCommand = commands[i];
            switch (currentCommand) {
                case "up":
                    if (currentRow - 1 >= 0) {
                        currentRow--;
                    }
                    break;
                case "down":
                    if (currentRow + 1 < size) {
                        currentRow++;
                    }
                    break;
                case "left":
                    if (currentCol - 1 >= 0) {
                        currentCol--;
                    }
                    break;
                case "right":
                    if (currentCol + 1 < size) {
                        currentCol++;
                    }
                    break;
            }
            if(matrix[currentRow][currentCol] == 'B'){
                bombs--;
                matrix[currentRow][currentCol] = '+';
                System.out.println("You found a bomb!");
            }
            if(bombs == 0){
                noMoreBombs = true;
                break;
            }
            if(matrix[currentRow][currentCol] == 'e'){
                theEnd = true;
                break;
            }
        }
        if(bombs == 0){
            System.out.println("Congratulations! You found all bombs!");
        }else if(theEnd){
            System.out.printf("END! %d bombs left on the field%n",bombs);
        }else {
            System.out.printf("%d bombs left on the field. Sapper position: (%d,%d)",bombs,currentRow,currentCol);
        }
    }
}
