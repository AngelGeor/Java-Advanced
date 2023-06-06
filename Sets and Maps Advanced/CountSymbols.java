package SetsAndMapsAdvanced_Ex;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<Character,Integer> symbolsOccurrences = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);

                if(!symbolsOccurrences.containsKey(currentSymbol)){
                    symbolsOccurrences.put(currentSymbol,1);
                }else {
                    int currentNumberOfOccurrences = symbolsOccurrences.get(currentSymbol);
                    symbolsOccurrences.put(currentSymbol,currentNumberOfOccurrences + 1);
                }

        }
        for (Map.Entry<Character, Integer> entry : symbolsOccurrences.entrySet()) {
            System.out.printf("%c: %d time/s%n", entry.getKey(),entry.getValue());
        }

    }
}
