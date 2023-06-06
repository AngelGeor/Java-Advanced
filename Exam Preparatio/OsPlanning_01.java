package ExamPreparation;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class OsPlanning_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> tasks = new ArrayDeque<>(); //stack
        Arrays.stream(scanner.nextLine().split(",\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(tasks::push);

        ArrayDeque<Integer> threads = new ArrayDeque<>(); //queue
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(threads::offer);

        int taskToKill = scanner.nextInt();

        int taskValue = 0;
        int threadValue = 0;

        while(taskValue != taskToKill){
            if(threads.peek() >= tasks.peek()) {
                taskValue = tasks.pop();
            }else {
                taskValue = tasks.peek();
            }
            threadValue = threads.poll();
        }
        System.out.printf("Thread with value %d killed task %d%n",threadValue,taskValue);
        System.out.print(threadValue + " ");

      threads.forEach(element -> System.out.print(element + " "));
    }
}
