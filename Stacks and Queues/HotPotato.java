package StacksAndQueues_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] children = scanner.nextLine().split("\\s+");
        int number = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> childrenQueue = new ArrayDeque<>();


        //dobavqme decata ot masiva v opashkata
        for (int i = 0; i < children.length ; i++) {
            childrenQueue.offer(children[i]);
        }

        while (childrenQueue.size() != 1) {

            for (int i = 1; i < number; i++) {
                String currentChild = childrenQueue.poll();
                childrenQueue.offer(currentChild);
            }
            String childToRemove = childrenQueue.poll();
            System.out.println("Removed" + " " + childToRemove);
        }
        String lastChild = childrenQueue.peek();
        System.out.printf("Last is %s", lastChild);
    }
}
