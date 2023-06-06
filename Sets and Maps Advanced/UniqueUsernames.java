package SetsAndMapsAdvanced_Ex;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        Set<String> usernames = new LinkedHashSet<>();

        for (int i = 0; i < number; i++) {
            String username = scanner.nextLine();
            usernames.add(username);
        }
        for(String username : usernames){
            System.out.println(username);
        }

    }
}
