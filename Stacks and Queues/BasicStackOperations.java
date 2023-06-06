package StackAndQueues_Ex;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt(); // broi na elementi, koito trqbva da dobavq
        int s = scanner.nextInt(); // broi na chislata za premahvane (pop)
        int x = scanner.nextInt(); // chisloto, koeto trqbva da se proveri dali e nalichno


        ArrayDeque<Integer> stack = new ArrayDeque<>();

        //1 Dobavqne

        for (int i = 0; i < n; i++) {
            stack.push(scanner.nextInt());
        }
        //2. Premahvane:

        for (int i = 0; i < s; i++) {
            stack.pop();
        }

        //3 Proverka dali chisloto X sushtestuva v Stacka

        if(stack.contains(x)) {
            System.out.println("true");
        }else {
            if (!stack.isEmpty()) {
                System.out.println(Collections.min(stack));
            }else {
                System.out.println("0");
            }
        }
    }
}
