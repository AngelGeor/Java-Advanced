package StreamsFilesAndDirectories_Lab;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Angel\\IdeaProjects\\Fundamentals\\Advanced\\src\\StreamsFilesAndDirectories_Lab\\input.txt";
        try (InputStream in = new FileInputStream(path)) {
            int oneByte = in.read();
            while(oneByte >= 0) {
                System.out.printf("%s ", Integer.toBinaryString(oneByte));
                oneByte = in.read();
            }
        }
        catch (IOException e) {
            System.out.println("IO Exception");
        }


    }
}
