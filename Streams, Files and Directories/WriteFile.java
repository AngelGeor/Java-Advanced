package StreamsFilesAndDirectories_Lab;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class WriteFile {
    public static void main(String[] args) {
     String pathIn = "C:\\Users\\Angel\\IdeaProjects\\Fundamentals\\Advanced\\src\\StreamsFilesAndDirectories_Lab\\input.txt";
     String pathOut ="C:\\Users\\Angel\\IdeaProjects\\Fundamentals\\Advanced\\src\\StreamsFilesAndDirectories_Lab\\02.WriteToFileOutput.txt";

        Set<Character> bannedCharacters = new HashSet<>();
        bannedCharacters.add('.');
        bannedCharacters.add(',');
        bannedCharacters.add('!');
        bannedCharacters.add('?');

        try (FileInputStream in = new FileInputStream(pathIn);
             FileOutputStream out = new FileOutputStream(pathOut))
         {
        int oneByte = in.read();
        while(oneByte >= 0){
            char myByteAsChar = (char)(oneByte);
            if (!bannedCharacters.contains(myByteAsChar)){
                out.write(oneByte);
            }
            oneByte = in.read();
        }

        } catch (IOException e) {

        }
    }
}
