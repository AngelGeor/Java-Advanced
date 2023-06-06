package DefiningClasses_Ex.OpinionPoll;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String name = input.split("\\s+")[0];
            int age = Integer.parseInt(input.split("\\s+")[1]);

            //Suzdavame konstruktura sus neobhodimite parametri - name & age i posle suzdavame obekta.
            Person person = new Person(name,age);
            if(age > 30){
              people.add(person);
            }
        }

        people.sort(Comparator.comparing(Person::getName));
        for (Person person : people){
            System.out.printf("%s - %d%n", person.getName(), person.getAge());;
           // System.out.println(person.toString());
        }

    }
}
