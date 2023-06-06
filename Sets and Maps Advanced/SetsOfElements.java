package SetsAndMapsAdvanced_Ex;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] length = scanner.nextLine().split("\\s+");

        int lengthOfSetOne =Integer.parseInt(length[0]);
        int lengthOfSetTwo =Integer.parseInt(length[1]);

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();

        for (int i = 0; i < lengthOfSetOne; i++) {
            int numberToFill = Integer.parseInt(scanner.nextLine());
            firstSet.add(numberToFill);
        }
        for (int i = 0; i < lengthOfSetTwo; i++) {
            int numberToFill = Integer.parseInt(scanner.nextLine());
            secondSet.add(numberToFill);
        }





        for (int number : firstSet) {
            if(secondSet.contains(number)) {
                System.out.print(number + " ");
            }
        }
    }
}
