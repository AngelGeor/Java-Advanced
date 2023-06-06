package SetsAndMapsAdvanced_Lab;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Voina_NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> firstPlayer = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        Set<Integer> secondPlayer = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        for (int round = 0; round < 50; round++) {
            //1. Proverqvame dali na nqkoi kartite ne sa svurshili:

            if (firstPlayer.isEmpty()){
                System.out.println("Second player win!");
                break;
            }
            if(secondPlayer.isEmpty()){
                System.out.println("First player win!");
                break;
            }

            int firstPlayerCard = firstPlayer.iterator().next();
            int secondPlayerCard = secondPlayer.iterator().next();

            firstPlayer.remove(firstPlayerCard);
            secondPlayer.remove(secondPlayerCard);

            if(firstPlayerCard > secondPlayerCard) {

                firstPlayer.add(firstPlayerCard);
                firstPlayer.add(secondPlayerCard);
            }else if (firstPlayerCard < secondPlayerCard) {
                secondPlayer.add(firstPlayerCard);
                secondPlayer.add(secondPlayerCard);
            }

        }

        int firstPlayerDeck = firstPlayer.size();
        int secondPlayerDeck = secondPlayer.size();

        if(firstPlayerDeck > secondPlayerDeck){
            System.out.println("First player win!");
        } else if (firstPlayerDeck < secondPlayerDeck){
            System.out.println("Second player win!");
        }else {
            System.out.println("Draw!");
        }

    }

}
