package Exam19_02;

import java.util.*;

public class FoodFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> vowels = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .forEach(vowels::offer);

        ArrayDeque<String> consonants = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .forEach(consonants::push);

        String pear = "pear";
        String flour = "flour";
        String pork = "pork";
        String olive = "olive";
        List<String> words = new LinkedList<>();
        words.add("test");
        words.add("test");
        words.add("test");
        words.add("test");

        List<String> newList = new LinkedList<>();

        while (!consonants.isEmpty()) {
            String currentConsonant = consonants.pop();
            String currentVowel = vowels.poll();
            vowels.offer(currentVowel);
            if (!pear.isEmpty()) {
                pear = findMatches(currentConsonant, currentVowel, pear);
                if (pear.isEmpty()) {
                    words.add(0, "pear");
                }
            }
            if (!flour.isEmpty()) {
                flour = findMatches(currentConsonant, currentVowel, flour);
                if (flour.isEmpty()) {
                    words.add(1, "flour");
                }
            }
            if (!pork.isEmpty()) {
                pork = findMatches(currentConsonant, currentVowel, pork);
                if (pork.isEmpty()) {
                    words.add(2, "pork");
                }
            }
            if (!olive.isEmpty()) {
                olive = findMatches(currentConsonant, currentVowel, olive);
                if (olive.isEmpty()) {
                    words.add(3, "olive");
                }
            }
        }


        for (String word : words){
            if(!word.equals("test")){
                newList.add(word);
            }
        }

        System.out.println("Words found: " + newList.size());
        newList.forEach(word -> System.out.println(word));


    }
    private static String findMatches(String currentConsonant, String currentVowel, String inputWord) {
        if (inputWord.contains(currentConsonant)) {
            inputWord = inputWord.replace(currentConsonant, "");
        }
        if (inputWord.contains(currentVowel)) {
            inputWord = inputWord.replace(currentVowel, "");
        }
        return inputWord;
    }

}
