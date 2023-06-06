package StreamsFilesAndDirectories_Ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class LineNumbers {
    public static void main(String[] args) throws IOException {
      String path = "C:\\Users\\Angel\\Downloads\\Java-Advanced-Files-and-Streams-Exercises-Resources\\InputLineNumbers.txt";
        PrintWriter printWriter = new PrintWriter ("output_line_numbers.txt");
       List<String> allLines = Files.readAllLines(Path.of(path));
        int number = 1;
       for (String line : allLines){
        printWriter.println(number + ". " +  line);
        number++;
       }
        printWriter.close();
    }
}
