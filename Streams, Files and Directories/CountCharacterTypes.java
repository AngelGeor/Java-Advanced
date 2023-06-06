package StreamsFilesAndDirectories_Ex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CountCharacterTypes {
    public static void main(String[] args) throws IOException {
        int vowelsCount = 0;
        int punctCount = 0;
        int consonantsCount = 0;

        String path = "C:\\Users\\Angel\\Downloads\\Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        List<String> allLines = Files.readAllLines(Path.of(path));
        for(String line : allLines) {
            for (int i = 0; i < line.length(); i++) {
                char currentSymbol = line.charAt(i);
                if(currentSymbol == ' '){
                    continue;
                }
                if(currentSymbol == 'a' || currentSymbol == 'e' || currentSymbol == 'i'
                || currentSymbol == 'o' || currentSymbol == 'u') {  // dali e glasna bukva
                   vowelsCount++;
                }else if(currentSymbol == '!' || currentSymbol == ',' || currentSymbol == '.'
                || currentSymbol == '?') {
                    punctCount++;
                }else {
                    consonantsCount++;
                }

            }
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter("output_task_4.txt"));
        writer.write("Vowels: " + vowelsCount);
        writer.newLine();
        writer.write("Consonants: " + consonantsCount);
        writer.newLine();
        writer.write("Punctuation: " + punctCount);
        writer.close();
    }
}
