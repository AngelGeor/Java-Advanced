package SetsAndMapsAdvanced_Ex;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,String> nameAndEmails = new LinkedHashMap<>();

        String name = scanner.nextLine();

        while(!name.equals("stop")){
            String email = scanner.nextLine();
            if(!email.endsWith("com") && !email.endsWith("us") && !email.endsWith("uk")){
                nameAndEmails.put(name,email);
            }

            name = scanner.nextLine();
        }

            nameAndEmails.forEach((key, value) -> System.out.printf("%s -> %s%n", key, value));

    }
}
