package StackAndQueues_Ex;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> actionsStack = new ArrayDeque<>();

        for (int i = 0; i < numberOfCommands; i++) {
            String commands = scanner.nextLine();
            int commandType = Integer.parseInt(commands.split("\\s+")[0]);

            switch (commandType) {
                case 1:
                    int elementToPush = Integer.parseInt(commands.split("\\s+")[1]);
                    actionsStack.push(elementToPush);
                    break;

                case 2:
                    actionsStack.pop();
                    break;

                case 3:
                    System.out.println(Collections.max(actionsStack));
                    break;
            }
        }

    }
}
