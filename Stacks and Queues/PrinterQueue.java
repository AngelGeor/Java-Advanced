package StacksAndQueues_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayDeque<String> filesQueue = new ArrayDeque<>();

        while (!input.equals("print")) {
            if (input.equals("cancel")){
                if(filesQueue.isEmpty()) {
                    System.out.println("Printer is on standby");

                }else { //not empty
                    String firstFileInQueue = filesQueue.poll();
                    System.out.printf("Canceled %s%n", firstFileInQueue);
                }

            }else { //file
                filesQueue.offer(input);

            }



            input = scanner.nextLine();
        }

        for(String element : filesQueue) {
            System.out.println(element);
        }

    }
}
