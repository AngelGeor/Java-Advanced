package ExamPreparation;

import java.util.Scanner;

public class CookingJourney_02 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     int size = Integer.parseInt(scanner.nextLine());
     char[][] matrix = new char[size][size];
     int currentRow = -1;
     int currentCow = -1;
     int money = 0;
     boolean firstPillarIsFound = false;
     int firstPillarCol = 0;
     int firstPillarRow = 0;
     int secondPillarCol = 0;
     int secondPillarRow = 0;

        for (int row = 0; row < size; row++) {
            char[] matrixRow = scanner.nextLine().toCharArray();
            matrix[row] = matrixRow;
        }
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if(matrix[row][col] == 'S'){
                    currentCow = col;
                    currentRow = row;
                }
                if(matrix[row][col] == 'P' && !firstPillarIsFound) {
                    firstPillarIsFound = true;
                    firstPillarCol = col;
                    firstPillarRow = row;
                }
                if(matrix[row][col] == 'P' && firstPillarIsFound){
                    secondPillarCol = col;
                    secondPillarRow = row;
                }
            }
        }
        while (money < 50){

            String command = scanner.nextLine();
            matrix[currentRow][currentCow] = '-';
            switch (command){
                case "up":
                    currentRow--;
                    break;
                case "down":
                    currentRow++;
                    break;
                case "left":
                    currentCow--;
                    break;
                case "right":
                    currentCow ++;
                    break;

                }
                if(currentCow < 0 || currentCow >= size || currentRow < 0 || currentRow >= size){

                    break;
            }
                if (currentRow == firstPillarRow && currentCow == firstPillarCol) {
                    matrix[firstPillarRow][firstPillarCol] = '-';
                    currentCow = secondPillarCol;
                    currentRow = secondPillarRow;
                    matrix[currentRow][currentCow] = 'S';
                }else if (currentRow == secondPillarRow && currentCow == secondPillarCol)  {
                matrix[secondPillarRow][secondPillarCol] = '-';
                currentCow = firstPillarCol;
                currentRow = firstPillarRow;
                matrix[currentRow][currentCow] = 'S';
            }else if(matrix[currentRow][currentCow] == '-'){
                    matrix[currentRow][currentCow] = 'S';
                }else {
                    money += Integer.parseInt(matrix[currentRow][currentCow]+ "");
                    matrix[currentRow][currentCow] = 'S';
                }
        }
        if(money < 50) {
            System.out.println("Bad news! You are out of the pastry shop.");
        }else{
            System.out.println("Good news! You succeeded in collecting enough money!");
        }
        System.out.printf("Money: %d%n",money);
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }
}
