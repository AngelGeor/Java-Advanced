package SetsAndMapsAdvanced_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LargestThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .sorted((el1, el2) -> el2.compareTo(el1))
                .limit(3)
                .collect(Collectors.toList());
        for(int number : numList){
            System.out.print(number + " ");
        }
    }
}
