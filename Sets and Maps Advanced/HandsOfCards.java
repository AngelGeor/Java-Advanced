package SetsAndMapsAdvanced_Ex;

import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, Set<String>> playersAndCards = new LinkedHashMap<>(); // Izpolzvavme set za da ne se povtarqt stoinostite
        while(!input.equals("JOKER")){

            String playerName = input.split(":\\s+")[0];
            String cards = input.split(":\\s+")[1];
            String[]cardArray = cards.split(", ");
            //1. Suhranqvame kartite v seta
            Set<String> cardsSet = new HashSet<>();
            cardsSet.addAll(Arrays.asList(cardArray));

            if(!playersAndCards.containsKey(playerName)){
                playersAndCards.put(playerName,cardsSet);
            }else {
                //Ako go ima, vzimame do momenta kartite i kum tqh pribavqme novite

                Set<String> currentCards = playersAndCards.get(playerName);
                currentCards.addAll(cardsSet);
                playersAndCards.put(playerName,currentCards);
            }

            input = scanner.nextLine();
        }
        playersAndCards.entrySet().forEach(entry -> {
            int playerPoints = getPoints(entry.getValue());
            System.out.printf("%s: %d%n",entry.getKey(),playerPoints);
                });
    }

    private static int getPoints(Set<String> cards) { // poluchava seta s kartite i vrushta tochkite
        Map<Character,Integer> symbolsValues = getSymbolsValues();  //Map za suhranqvane na stoinostite na vsqka bukva

        // Set s karti: 6H, 7S, KC, KD, 5S, 10C
        //1. Trqbva da vzemem vsqka edna karta i da namerim neinata sila. Sled tova dobavqme silata na kartata
        // kum sumata na silata na vsichki karti
        int sumPoints = 0;
        int points = 0;
        for(String card: cards){
            if(card.startsWith("10")){
                char type = card.charAt(2);
                points = 10 * symbolsValues.get(type);

            }else {

                char power = card.charAt(0);
                char type = card.charAt(1);
                points = symbolsValues.get(power) * symbolsValues.get(type);
            }

            sumPoints += points;
        }
        return sumPoints;
    }

    private static Map<Character, Integer> getSymbolsValues() {
        Map<Character,Integer> characterValues = new HashMap<>();
        characterValues.put('2',2);
        characterValues.put('3',3);
        characterValues.put('4',4);
        characterValues.put('5',5);
        characterValues.put('6',6);
        characterValues.put('7',7);
        characterValues.put('8',8);
        characterValues.put('9',9);
        characterValues.put('J',11);
        characterValues.put('Q',12);
        characterValues.put('K',13);
        characterValues.put('A',14);
        characterValues.put('S',4);
        characterValues.put('H',3);
        characterValues.put('D',2);
        characterValues.put('C',1);
        return characterValues;
    }
}
