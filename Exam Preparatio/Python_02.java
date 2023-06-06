package ExamPreparation;

import java.util.Scanner;

public class Python_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        String[] commands = scanner.nextLine().split(",\\s+");
        char[][] matrix = new char[size][size];
        for (int row = 0; row < size; row++) {
            char[] matrixRow = scanner.nextLine().replaceAll(" ", "").toCharArray();
            matrix[row] = matrixRow;
        }
        int pythonRow = -1;
        int pythonCol = -1;
        int availableFood = 0;
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (matrix[row][col] == 's') {
                    pythonRow = row;
                    pythonCol = col;

                } else if (matrix[row][col] == 'f') {
                    availableFood++;
                }
            }
        }

        int length = 1;
        boolean isDead = false;
        for (int i = 0; i < commands.length; i++) {
            String currentCommand = commands[i];
            matrix[pythonRow][pythonCol] = '*';
            switch (currentCommand) {
                case "up":
                    pythonRow--;
                 break;
                case "down":
                    pythonRow++;
                    break;
                case "left":
                    pythonCol--;
                    break;
                case "right":
                    pythonCol++;
                    break;
            }

            if(pythonRow < 0 || pythonRow >= size){
                if(pythonRow < 0){
                    pythonRow = size -1;
                } if(pythonRow >= size){
                    pythonRow = 0;
                }
            }
            if(pythonCol < 0 || pythonCol >= size) {
                if(pythonCol < 0){
                    pythonCol = size -1;
                } if(pythonCol >= size){
                    pythonCol = 0;
                }
            }
            if(matrix[pythonRow][pythonCol] == 'f'){
                length++;
                availableFood --;
            }
            if(availableFood == 0){
                break;

            }
            if(matrix[pythonRow][pythonCol] == 'e'){
                isDead = true;
                break;
            }
        }
        if(availableFood == 0){
            System.out.println("You win! Final python length is " + length);
        }else if(isDead){
            System.out.println("You lose! Killed by an enemy!");
        }else {
            System.out.printf("You lose! There is still %d food to be eaten.",availableFood);
        }
    }
}
