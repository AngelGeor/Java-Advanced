package StacksAndQueues_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayDeque<Integer> expressions = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            char currentElement = input.charAt(i);

            if (currentElement == '('){
                expressions.push(i);
            } else if (currentElement == ')') {
                int startIndex = expressions.pop();
                String subExpression = input.substring(startIndex, i + 1);
                System.out.println(subExpression);
            }

        }


    }
}
