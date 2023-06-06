package ExamPreparation;

import java.util.*;

public class Cocktails_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> ingredients = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))  // queue
                .mapToInt(Integer::parseInt)
                .forEach(ingredients::offer);

        ArrayDeque<Integer> freshnessLevel = new ArrayDeque<>();   // stack
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(freshnessLevel::push);

        Map<String,Integer> cocktailsMap = new TreeMap<>();

            while (!ingredients.isEmpty() && !freshnessLevel.isEmpty()) {

                int ingredient = ingredients.poll();
                if (ingredient == 0){
                    continue;
                }
                int freshness = freshnessLevel.pop();
                int mix = ingredient * freshness;
                if(mix == 150) {
                    if(!cocktailsMap.containsKey("Pear Sour")){
                        cocktailsMap.put("Pear Sour",1);
                    }else {
                        cocktailsMap.put("Pear Sour",cocktailsMap.get("Pear Sour") + 1);
                    }
                }else if(mix == 250) {
                    if(!cocktailsMap.containsKey("The Harvest")){
                        cocktailsMap.put("The Harvest",1);
                    }else {
                        cocktailsMap.put("The Harvest",cocktailsMap.get("The Harvest") + 1);
                    }
                }else if(mix == 300) {
                    if(!cocktailsMap.containsKey("Apple Hinny")){
                        cocktailsMap.put("Apple Hinny",1);
                    }else {
                        cocktailsMap.put("Apple Hinny",cocktailsMap.get("Apple Hinny") + 1);
                    }
                }else if (mix == 400) {
                    if(!cocktailsMap.containsKey("High Fashion")){
                        cocktailsMap.put("High Fashion",1);
                    }else {
                        cocktailsMap.put("High Fashion",cocktailsMap.get("High Fashion") + 1);
                    }
                }else {
                    int ingredientToOffer = ingredient + 5;
                    ingredients.offer(ingredientToOffer);
                }
            }

            if(cocktailsMap.size() < 4){
                System.out.println("What a pity! You didn't manage to prepare all cocktails.");
                int sum = 0;
                for(int ingredient : ingredients) {
                    sum += ingredient;
                }
                if (sum > 0){
                    System.out.println("Ingredients left: " + sum);
                }
                for (Map.Entry<String, Integer> entry : cocktailsMap.entrySet()) {
                    System.out.printf("# %s --> %d%n", entry.getKey(),entry.getValue());
                }

            }else {
                System.out.println("It's party time! The cocktails are ready!");
                int sum = 0;
                for(int ingredient : ingredients) {
                    sum += ingredient;
                }
                if (sum > 0){
                    System.out.println("Ingredients left: " + sum);
                }
                for (Map.Entry<String, Integer> entry : cocktailsMap.entrySet()) {
                    System.out.printf("# %s --> %d%n", entry.getKey(),entry.getValue());
                }
            }
    }

    }

