package SetsAndMapsAdvanced_Ex;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,Integer> metalAndQuantity = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while(!input.equals("stop")){
            int quantity = Integer.parseInt(scanner.nextLine());

            if(!metalAndQuantity.containsKey(input)){
                metalAndQuantity.put(input,quantity);
            }else {
                int currentQuantity = metalAndQuantity.get(input);
                metalAndQuantity.put(input,currentQuantity + quantity);
            }

            input = scanner.nextLine();
        }

        metalAndQuantity.forEach((key,value) -> System.out.printf("%s -> %s%n",key, value));
    }
}
