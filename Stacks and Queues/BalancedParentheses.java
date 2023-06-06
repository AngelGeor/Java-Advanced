package StackAndQueues_Ex;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque <Character> openBracketsStack = new ArrayDeque<>();

        boolean isBalanced = false;

        for (int i = 0; i < input.length() ; i++) {
            char currentSymbol = input.charAt(i);
            //Proverka za otvorena skoba
            if(currentSymbol == '{' || currentSymbol == '(' || currentSymbol == '['){
                openBracketsStack.push(currentSymbol);

               //Proverka za zatvorena skoba
            }else if (currentSymbol == '}' || currentSymbol == ')' || currentSymbol == ']'){
       //!Proverka dali poslednata otvorena skoba suvpada sus zatvoernata, i sushto dali IZOBSHTO IMA OTVORENI SKOBI

                if(openBracketsStack.isEmpty()){
                    isBalanced = false;
                    break;
                }
                char lastOpen = openBracketsStack.pop();

                //Proverka dali tekushtata zatvorena suvpada sus poslednata otvrena
                if(currentSymbol == '}' && lastOpen == '{'){
                    //balance
                    isBalanced = true;

                }else if(currentSymbol == ']' && lastOpen == '['){
                    //balance
                    isBalanced = true;
                }else if (currentSymbol == ')' && lastOpen == '(') {
                    //balance
                    isBalanced = true;
                }else {
                    //no balance
                    isBalanced = false;
                    break;
                }
            }
        }
        if(isBalanced) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}
