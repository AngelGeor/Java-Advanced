package ExamPreparation;

import java.util.Scanner;

public class MouseAndCheese_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[size][size];
        //Namirame zadavame na purvonachalni kordinati na mishkata,predi da zapochnem da q tuyrsim
        int mouseRow = -1;
        int mouseCol = -1;
        int cheeseCounter = 0; // broi izqdenite sirena

        fillInMatrix(scanner, size, matrix);

        // namirane na mishkata:
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                char currentSymbol = matrix[row][col];
                if (currentSymbol == 'M') {
                    mouseRow = row;
                    mouseCol = col;
                }
            }
        }

        String direction = scanner.nextLine();
        while (!direction.equals("end")) {
            // directions => up, down, right,left
            matrix[mouseRow][mouseCol] = '-';
            switch (direction) {
                case "right": // uvelichavame s koloata s 1:
                    mouseCol++;
                    break;
                case "down":
                    //uvelichaveme reda s 1:
                    mouseRow++;
                    break;
                case "left"://Namalqme kolata s 1;
                    mouseCol--;
                    break;
                case "up":
                    // namalqme reda s 1:
                    mouseRow--;
                    break;
            }
            //Proverqvame dali kordinatite na mishkata sa v matricata
            if (mouseCol < 0 || mouseCol >= size || mouseRow < 0 || mouseRow >= size) {
                System.out.println("Where is the mouse?");
                break;
            }
            //Predi da slojim mishkata, trqbva da i proverim mqstoto i dali ne stupva na sirene ili bonus:

            if (matrix[mouseRow][mouseCol] == 'c') { // ima sierene
                cheeseCounter++;


            } else if (matrix[mouseRow][mouseCol] == 'B') { //ima bonus
                continue;
            }
            //Ako kordinatite sa v matircata =>
            //Postavqne na novoto mqsto na mishkata
            matrix[mouseRow][mouseCol] = 'M';
            direction = scanner.nextLine();
        }

        if(cheeseCounter >= 5) {
            System.out.printf("Great job, the mouse is fed %d cheeses!",cheeseCounter);
            
        }else {
            System.out.printf("The mouse couldn't eat the cheeses, she needed %d cheeses more.", 5 - cheeseCounter);
        }
        matrixPrint(size, matrix);
    }

    private static void matrixPrint(int size, char[][] matrix) {
        System.out.println();
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }

    private static void fillInMatrix(Scanner scanner, int size, char[][] matrix) {
        for (int row = 0; row < size; row++) {
            String rowContent = scanner.nextLine();
            char[] matrixRow = rowContent.toCharArray();
            matrix[row] = matrixRow;
        }
    }
}
