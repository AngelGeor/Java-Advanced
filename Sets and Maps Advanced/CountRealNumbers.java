package SetsAndMapsAdvanced_Lab;

import java.util.*;
import java.util.stream.Collectors;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numList = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        Map<Double, Integer> numberOccurrences = new LinkedHashMap<>();

        for (int i = 0; i < numList.size(); i++) {
            double currentNumber = numList.get(i);
            if(numberOccurrences.containsKey(currentNumber)){
                int currentValue = numberOccurrences.get(currentNumber);
                numberOccurrences.put(currentNumber,currentValue + 1);
            }else {
               numberOccurrences.put(currentNumber,1);
            }
        }
        //for(Double number : numberOccurrences.keySet()){
      //      System.out.printf("%.1f -> %d%n", number, numberOccurrences.get(number));
     //   }

        for (Map.Entry<Double, Integer> entry : numberOccurrences.entrySet()) {
            System.out.printf("%.1f -> %d%n",entry.getKey(),entry.getValue());
        }


    }
}
