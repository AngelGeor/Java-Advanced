package IteratorsAndComparators_Ex.ComparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        List<Person> people = new ArrayList<>();
        int countAllPeople = 0;
        while (!command.equals("END")){

            String name = command.split("\\s+")[0];
            int age = Integer.parseInt(command.split("\\s+")[1]);
            String town = command.split("\\s+")[2];
            Person person = new Person(name,age,town);
            people.add(person);
            countAllPeople++;
            command = scanner.nextLine();
        }

        int n = Integer.parseInt(scanner.nextLine());
        Person searchedPerson = people.get(n - 1);
        people.remove(n-1);
        int countOfSimilarPeople = 0;

        for(Person person : people) {
            if(searchedPerson.compareTo(person) == 0){
                countOfSimilarPeople ++ ;
            }
        }
        if(countOfSimilarPeople == 0){
            System.out.println("No matches");
        }else {
            System.out.printf("%d %d %d", countOfSimilarPeople + 1, countAllPeople - (countOfSimilarPeople + 1),countAllPeople );

        }
    }
}
