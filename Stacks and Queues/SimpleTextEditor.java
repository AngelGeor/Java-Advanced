package StackAndQueues_Ex;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfCommands = Integer.parseInt(scanner.nextLine());

        StringBuilder sb = new StringBuilder();

        ArrayDeque<String> textStack = new ArrayDeque<>();

        for (int i = 0; i < countOfCommands; i++) {
            String command = scanner.nextLine();
            int commandNumber = Integer.parseInt(command.split("\\s+")[0]);

            switch (commandNumber) {

                case 1:
                    textStack.push(sb.toString()); // zapazvame staroto sustoqnie na teksta za da moje da go popnem ako
                    // poluchim 4
                    String stringToAppend = command.split("\\s+")[1];
                    sb.append(stringToAppend);

                    break;

                case 2:
                    textStack.push(sb.toString());
                    int countToDelete = Integer.parseInt(command.split("\\s+")[1]);
                    int startIndexToDelete = sb.length() - countToDelete; // vijdame ot kude zapochvame da mahame
                    sb.delete(startIndexToDelete, startIndexToDelete + countToDelete);
                    break;

                case 3:
                    int index = Integer.parseInt(command.split("\\s+")[1]);
                    System.out.println(sb.charAt(index - 1)); // elementa se namira v poziciq nomer na element - 1;

                    break;

                case 4:
                    //!Zaduljitelno proverka purvo dali stack-a ne e prazen, inache gurmi!
                    if(!textStack.isEmpty()) {
                        sb = new StringBuilder(textStack.pop());
                    }
                    break;
            }
        }

    }
}
