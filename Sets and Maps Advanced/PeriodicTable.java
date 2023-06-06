package SetsAndMapsAdvanced_Ex;

import java.util.*;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        Set<String> compounds = new TreeSet<>();

        for (int i = 0; i < number; i++) {
            String[] compoundLines = scanner.nextLine().split("\\s+");
            for (int j = 0; j < compoundLines.length; j++) {
                compounds.add(compoundLines[j]);
            }
        }

        for (String compound : compounds) {
            System.out.print(compound + " ");
        }

    }
}
