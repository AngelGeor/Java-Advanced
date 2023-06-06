package StreamsFilesAndDirectories_Lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBites {
    public static void main(String[] args) throws IOException {
        String pathIn = "C:\\Users\\Angel\\IdeaProjects\\Fundamentals\\Advanced\\src\\StreamsFilesAndDirectories_Lab\\input.txt";
        String pathOut = "C:\\Users\\Angel\\IdeaProjects\\Fundamentals\\Advanced\\src\\StreamsFilesAndDirectories_Lab\\03.CopyBytesOutput.txt";

        FileInputStream in = new FileInputStream(pathIn);
        FileOutputStream out = new FileOutputStream(pathOut);

        int oneByte = in.read();
        while (oneByte >= 0){
            if(oneByte == 32 || oneByte == 10){
                out.write((char)oneByte);
            }else {
                String digits = String.valueOf(oneByte);
                for (int i = 0; i < digits.length(); i++) {
                    out.write(digits.charAt(i));
                }

            }

            oneByte = in.read();
        }
    }
}
