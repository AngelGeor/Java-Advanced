package StreamsFilesAndDirectories_Ex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class SumLines {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String path = "C:\\Users\\Angel\\IdeaProjects\\Fundamentals\\Advanced\\src\\StreamsFilesAndDirectories_Ex\\input.txt";
        
            List<String> allLines = Files.readAllLines(Path.of(path));
            for(String line : allLines){
                int sum = 0;
                for (int i = 0; i < line.length(); i++) {
                    char currentSymbol = line.charAt(i);
                    sum += currentSymbol;
                }
                System.out.println(sum);
            }
   
    }
}
