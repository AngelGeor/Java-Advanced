package StackAndQueues_Ex;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        ArrayDeque <String> numbersStack = new ArrayDeque<>();

        for (String number : input) {
            numbersStack.push(number);
        }

        while (!numbersStack.isEmpty()){
            System.out.print(numbersStack.pop() + " ");
        }
    }
}
