package Generics_Ex.GenericBoxCountMethodString;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        //задача 1
        /*Box<String> box = new Box<>();
        for (int i = 0; i < n; i++) {
            String text = scanner.nextLine();
            box.add(text);
        }
        System.out.println(box);*/

        //задача 2
        /*Box<Integer> numbersBox = new Box<>();
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            numbersBox.add(number);
        }
        System.out.println(numbersBox);*/

        //Задача 3
       /* Box<String> box = new Box<>();
        for (int i = 0; i < n; i++) {
            String text = scanner.nextLine();
            box.add(text);
        }

        int firstIndex = scanner.nextInt();
        int secondIndex = scanner.nextInt();
        box.swap(firstIndex, secondIndex);

        System.out.println(box);*/

        //задача 4
        /*Box<Integer> box = new Box<>();
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            box.add(number);
        }

        int firstIndex = scanner.nextInt();
        int secondIndex = scanner.nextInt();
        box.swap(firstIndex, secondIndex);

        System.out.println(box);*/

        //задача 5
        Box<String> box = new Box<>();
        for (int i = 0; i < n; i++) {
            String text = scanner.nextLine();
            box.add(text);
        }

        String element = scanner.nextLine(); //елемент, за който търся колко от елементите в списъка са по-големи
        System.out.println(box.countGreaterThan(element));

      //  задача 6
    //   Box<Double> box = new Box<>();
        //   for (int i = 0; i < n; i++) {
        //       double doubleNumber = Double.parseDouble(scanner.nextLine());
        //      box.add(doubleNumber);
        //    }

        //  double element = Double.parseDouble(scanner.nextLine()); //елемент, за който търся колко от елементите в списъка са по-големи
        //   System.out.println(box.countGreaterThan(element));
        //

    }
}
