package ExamPreparation;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Meeting_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> males = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(males::push);

        ArrayDeque<Integer> females = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(females::offer);
            int matches = 0;

        while(!males.isEmpty() && !females.isEmpty()){
            int currentMale = males.peek();
            if(currentMale <= 0){
                males.pop();
                continue;
            }else if(currentMale % 25 == 0){
                males.pop();
                if(!males.isEmpty()){
                    males.pop();
                }
                continue;
            }

            int currentFemale = females.peek();
            if(currentFemale <= 0){
                females.poll();
                continue;
            }else if(currentFemale % 25 == 0){
                females.poll();
                if(!females.isEmpty()){
                    females.poll();
                }
                continue;
            }

            if(currentFemale == currentMale){
                matches++;
                males.pop();
                females.poll();
            }else {
                females.poll();
                males.pop();
                males.push(currentMale - 2);
            }

        }

        System.out.println("Matches: " + matches);
        if(males.isEmpty()){
            System.out.println("Males left: none");
        }else {
            System.out.print("Males left: ");
            System.out.println(males.toString().replaceAll("[\\[\\]]", ""));
        }
        if(females.isEmpty()){
            System.out.println("Females left: none");
        }else {
            System.out.print("Females left: ");
            System.out.println(females.toString().replaceAll("[\\[\\]]", ""));
        }
    }
}