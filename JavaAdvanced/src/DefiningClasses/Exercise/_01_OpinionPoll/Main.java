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
            Person person;
            String[] personInfo = scanner.nextLine().split(" ");
            if (personInfo.length == 2) {
                String name = personInfo[0];
                int age = Integer.parseInt(personInfo[1]);
                person = new Person(name, age);
            } else {
                if (personInfo[0].matches(".*\\d+.*")) {
                    int age = Integer.parseInt(personInfo[0]);
                    person = new Person(age);
                } else {
                    String name = personInfo[0];
                    person = new Person(name);
                }
            }
            personList.add(person);
            Employee employee = new Employee("Pesho",50);
            Employee employee1 = new Employee("Ivan", 23, employee.getId());
            Employee employee2 = new Employee("DEBEL", 23);
            employee.introduceYourself();
            person.introduceYourself();
        }



        List<Person> sortedList =
                personList.stream().filter(e -> e.getAge() > 30)
                        .sorted(Comparator.comparing(Person::getName))
                        .collect(Collectors.toList());

        sortedList.forEach(e ->

        {
            System.out.printf("%s - %d\n", e.getName(), e.getAge());
        });

    }
}
