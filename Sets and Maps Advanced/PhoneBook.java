package SetsAndMapsAdvanced_Ex;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,String> nameAndNumbers = new LinkedHashMap<>();
        String input = scanner.nextLine();


            while (!input.equals("search")){
                String[] inputLines = input.split("-");
                nameAndNumbers.put(inputLines[0],inputLines[1]);
                input= scanner.nextLine();
            }

            String namesToCheck = scanner.nextLine();
            while(!namesToCheck.equals("stop")){
                if(nameAndNumbers.containsKey(namesToCheck)){
                    System.out.printf("%s -> %s%n",namesToCheck, nameAndNumbers.get(namesToCheck));
                }else {
                    System.out.printf("Contact %s does not exist.%n", namesToCheck);
                }


                namesToCheck = scanner.nextLine();
            }

    }
}
