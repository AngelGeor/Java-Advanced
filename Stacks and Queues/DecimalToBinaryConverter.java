package StacksAndQueues_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimal = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        if(decimal == 0) {
            System.out.println(0);
        }else {

        while (decimal != 0) {
            int leftover = decimal % 2;
            stack.push(leftover);
            decimal = decimal / 2;
        }
        }
        //int stackSize = stack.size(); // durjim go v otdelna promenliva poneje se smenq vuv cikula pri printirane s pop-a
        //for (int i = 0; i < stackSize; i++) {
         //  System.out.print(stack.pop());
      //  }

        //printirane s forEach:

        for (int element : stack) {
          System.out.print(element);
       }
    }
}
