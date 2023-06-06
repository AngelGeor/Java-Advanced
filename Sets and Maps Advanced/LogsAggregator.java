package SetsAndMapsAdvanced_Ex;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class LogsAggregator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> nameAndDuration = new TreeMap<>();
        Map<String, TreeSet<String>> nameAndIp = new TreeMap<>();

        for (int i = 0; i < number; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String ip = input[0];
            String username = input[1];
            int duration = Integer.parseInt(input[2]);

            if(!nameAndDuration.containsKey(username)){
                nameAndDuration.put(username,duration);
                nameAndIp.put(username,new TreeSet<>(){{
                    add(ip);
                }});
            }else {
                int currentTime = nameAndDuration.get(username);
                nameAndDuration.put(username,currentTime + duration);
                nameAndIp.get(username).add(ip);
            }

        }

        nameAndDuration.forEach((key,value )->{
            System.out.println(String.format("%s: %d %s", key, value, nameAndIp.get(key).toString()));
        });

    }
}
