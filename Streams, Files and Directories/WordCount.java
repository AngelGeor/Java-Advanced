package StreamsFilesAndDirectories_Ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class WordCount {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        //word.txt -> dumi koito shte broim v drug file

        String pathWords = "C:\\Users\\Angel\\Downloads\\Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt";

        Map<String,Integer> countWords = new HashMap<>();


        List<String> allLinesWords = Files.readAllLines(Path.of(pathWords));
        for (String line : allLinesWords) {
            Arrays.stream(line.split("\\s+")).forEach(
                    word -> {
                        countWords.put(word,0);
                    }
            );
        }

        String path = "C:\\Users\\Angel\\Downloads\\Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt";
        List<String> allLines = Files.readAllLines(Path.of(path));
        for(String line : allLines) {
            Arrays.stream( line.split("\\s+")).forEach(word ->{
                if(countWords.containsKey(word)) {
                    countWords.put(word,countWords.get(word) + 1);
                }
            });

        }
        
        PrintWriter pw = new PrintWriter("results.txt");
        countWords.entrySet().stream().sorted((entry1, entry2 ) -> entry2.getValue().compareTo(entry1.getValue()))
                .forEach(entry -> pw.println(entry.getKey() + " - " + entry.getValue()));
        pw.close();

    }
}
