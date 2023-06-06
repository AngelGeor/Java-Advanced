package Generics_Ex.CustomList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomList<String> customList = new CustomList<>();

        String input = scanner.nextLine();

        while(!input.equals("END")){
            String commandType = input.split("\\s+")[0];

            switch (commandType){
                case "Add":
                    String itemToAdd = input.split("\\s+")[1];
                    customList.add(itemToAdd);
                    break;
                case "Remove":
                    int indexToRemove = Integer.parseInt(input.split("\\s+")[1]);
                    customList.remove(indexToRemove);
                    break;
                case "Contains":
                String element = input.split("\\s+")[1];
                    System.out.println(customList.contains(element));
                    break;
                case "Swap":
                    int firstIndex = Integer.parseInt(input.split("\\s+")[1]);
                    int secondIndex = Integer.parseInt(input.split("\\s+")[2]);
                    customList.swap(firstIndex,secondIndex);
                    break;
                case "Greater":
                    String elementForCheck = (input.split("\\s+")[1]);
                    System.out.println(customList.countGreaterThan(elementForCheck));
                    break;
                case "Max":
                    System.out.println(customList.getMax());
                    break;
                case "Min":
                    System.out.println(customList.getMin());
                    break;
                case "Print":
                    customList.print();
                    break;
                case "Sort":
                    customList.sort();
                    break;
            }


            input = scanner.nextLine();
        }
    }
}
