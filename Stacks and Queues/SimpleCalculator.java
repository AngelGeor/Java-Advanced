package StacksAndQueues_Lab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split("\\s+");
        ArrayDeque <String> tokens = new ArrayDeque<>();

        Collections.addAll(tokens,input); // dobavqme elementite na masiva v stack-a

        while (tokens.size() > 1) {
            int firstNum = Integer.parseInt(tokens.pop());
            String operator = tokens.pop();
            int secondNum = Integer.parseInt(tokens.pop());
            int result = 0;

            if(operator.equals("+")){
                result = firstNum + secondNum;
            }else {
                result = firstNum - secondNum;
            }
            tokens.push(String.valueOf(result));
        }
        System.out.println(tokens.peek());

    }
}
