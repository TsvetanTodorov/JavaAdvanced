package DefiningClasses.Exercise._01_OpinionPoll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Person> personList = new ArrayList<>();

        int personCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < personCount; i++) {
            String[] personInfo = scanner.nextLine().split(" ");
            String name = personInfo[0];
            int age = Integer.parseInt(personInfo[1]);

            Person person = new Person(name, age);
            personList.add(person);
        }

        List<Person> sortedList =
                personList.stream().filter(e -> e.getAge() > 30)
                        .sorted(Comparator.comparing(Person::getName))
                        .collect(Collectors.toList());

        sortedList.forEach(e -> {
            System.out.printf("%s - %d\n", e.getName(), e.getAge());
        });

    }
}
