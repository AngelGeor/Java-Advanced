package StackAndQueues_Ex;

import java.util.Scanner;

public class RecursiveFibonacci {
    public static long[] memoryForFib; // suzdavane na statichen masiv za da moje da se polzva v metoda dolu
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        memoryForFib = new long[n + 1];
        System.out.println(fib(n));

    }

    public static long fib (int n){
       if (n <= 1){
           return 1;
       }
       if (memoryForFib[n] != 0){              //ako go ima veche izchisleno i e v masiva
           return memoryForFib[n];
       }

        return memoryForFib[n] = fib(n-1) + fib(n - 2);
    }
}
