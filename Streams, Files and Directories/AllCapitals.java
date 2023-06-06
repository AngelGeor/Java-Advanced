package StreamsFilesAndDirectories_Ex;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;

public class AllCapitals {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Angel\\Downloads\\Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));

        BufferedReader br = new BufferedReader(new FileReader(path));
        String line = br.readLine();

        while(line != null) {
           bw.write(line.toUpperCase());
           bw.newLine();

           line = br.readLine();
        }
        bw.close();
    }
}
