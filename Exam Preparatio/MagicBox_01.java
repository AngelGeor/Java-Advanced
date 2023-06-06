package ExamPreparation;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class MagicBox_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> firstBox = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))  // queue
                .mapToInt(Integer::parseInt)
                .forEach(firstBox::offer);

        ArrayDeque<Integer> secondBox = new ArrayDeque<>();   // stack
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(secondBox::push);

        int claimedItemsCollection = 0;

        while(!firstBox.isEmpty() && !secondBox.isEmpty()){
            int firstItem = firstBox.peek();
            int secondItem = secondBox.peek();
            int sum = firstItem + secondItem;

            if(sum % 2 == 0) {
                claimedItemsCollection += sum;
                firstBox.poll();
                secondBox.pop();
            }else {
                firstBox.offer(secondItem);
                secondBox.pop();
            }
            if(firstBox.isEmpty()){
                System.out.println("First magic box is empty.");
            }
            if(secondBox.isEmpty()){
                System.out.println("Second magic box is empty.");
            }
        }
        if(claimedItemsCollection >= 90){
            System.out.println("Wow, your prey was epic! Value: " + claimedItemsCollection);
        }else {
            System.out.println("Poor prey... Value: " + claimedItemsCollection);
        }
    }
}
