package StreamsFilesAndDirectories_Ex;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MergeTwoFiles {
    public static void main(String[] args) throws IOException {


        //1.
      String pathFileOne = "C:\\Users\\Angel\\Downloads\\Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt";
      String pathFileTwo = "C:\\Users\\Angel\\Downloads\\Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt";
       PrintWriter pr = new PrintWriter("outputMerge.txt");

       List<String> allLinesFileOne = Files.readAllLines(Path.of(pathFileOne));
       allLinesFileOne.forEach(line -> pr.println(line));

       List<String> allLinesFileTwo = Files.readAllLines(Path.of(pathFileTwo));
       allLinesFileTwo.forEach(line -> pr.println(line));

       pr.close();

    }
}
