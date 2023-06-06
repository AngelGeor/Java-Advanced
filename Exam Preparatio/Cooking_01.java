package ExamPreparation;

import java.io.FileInputStream;
import java.util.*;

public class Cooking_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayDeque<Integer> liquids = new ArrayDeque<>();          //queue
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(liquids::offer);

        ArrayDeque<Integer> ingredients = new ArrayDeque<>();    //stack
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(ingredients::push);

        Map<String,Integer> pastriesMap = new TreeMap<>();
        pastriesMap.put("Bread",0);
        pastriesMap.put("Cake",0);
        pastriesMap.put("Fruit Pie",0);
        pastriesMap.put("Pastry",0);
        int breadCounter = 0;
        int cakeCounter = 0;
        int pastryCounter = 0;
        int fruitCounter = 0;



        while(!liquids.isEmpty() && !ingredients.isEmpty()){
            int liquid = liquids.poll();
            int ingredient = ingredients.pop();
            int sum = liquid + ingredient;

            if(sum == 25) {
                String name = "Bread";

                    pastriesMap.put(name, pastriesMap.get(name) + 1);
                        breadCounter++;
            }else if (sum == 50){
                String name = "Cake";

                    pastriesMap.put(name, pastriesMap.get(name) + 1);
                        cakeCounter ++;
            }else if( sum == 75) {
                String name = "Pastry";


                    pastriesMap.put(name, pastriesMap.get(name) + 1);
                    pastryCounter++;
            }else if (sum == 100) {
                String name = "Fruit Pie";

                    pastriesMap.put(name, pastriesMap.get(name) + 1);
                    fruitCounter ++;
            }else {
                ingredients.push(ingredient + 3);
            }
        }
        if(breadCounter != 0 && pastryCounter != 0 && cakeCounter != 0 && fruitCounter != 0){
            System.out.println("Wohoo! You succeeded in cooking all the food!");
        }else {
            System.out.println("Ugh, what a pity! You didn't have enough materials to cook everything.");
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
        for (Map.Entry<String, Integer> entry : pastriesMap.entrySet()) {
            System.out.printf("%s: %d%n",entry.getKey(), entry.getValue());
        }

    }
}
