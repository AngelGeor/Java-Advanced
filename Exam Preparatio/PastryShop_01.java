package ExamPreparation;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class PastryShop_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> liquids = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))  // queue
                .mapToInt(Integer::parseInt)
                .forEach(liquids::offer);

        ArrayDeque<Integer> ingredients = new ArrayDeque<>();   // stack
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(ingredients::push);

            int biscuits = 0;
            int cakes = 0;
            int pies = 0;
            int pastries = 0;

            while (!liquids.isEmpty() && !ingredients.isEmpty()) {
                int liquid = liquids.peek();
                int ingredient = ingredients.peek();
                int sum = liquid + ingredient;

                if(sum == 25){
                    biscuits ++;
                    liquids.poll();
                    ingredients.pop();
                }else if (sum == 50){
                    cakes ++;
                    liquids.poll();
                    ingredients.pop();
                }else if (sum == 75){
                    pastries ++;
                    liquids.poll();
                    ingredients.pop();
                }else if (sum == 100){
                    pies ++;
                    liquids.poll();
                    ingredients.pop();
                }else {
                    liquids.poll();
                    ingredients.pop();
                    ingredients.push(ingredient + 3);

                }

            }
            if(biscuits != 0 && pastries != 0 && cakes != 0 && pies != 0){
                System.out.println("Great! You succeeded in cooking all the food!");
            }else {
                System.out.println("What a pity! You didn't have enough materials to cook everything.");
            }
            if(liquids.isEmpty()){
                System.out.println("Liquids left: none");
            }else {
                System.out.printf("Liquids left: %s%n", liquids.toString().replaceAll("[\\[\\]]", ""));
            }
        if(ingredients.isEmpty()){
            System.out.println("Ingredients left: none");
        }else {
            System.out.printf("Ingredients left: %s%n", ingredients.toString().replaceAll("[\\[\\]]", ""));
        }
        System.out.printf("Biscuit: %d%n", biscuits);
        System.out.printf("Cake: %d%n", cakes);
        System.out.printf("Pie: %d%n",pies);
        System.out.printf("Pastry: %d",pastries);

    }
}
