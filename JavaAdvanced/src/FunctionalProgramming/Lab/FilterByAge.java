package FunctionalProgramming.Lab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FilterByAge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> peopleMap = new LinkedHashMap<>();

        for (int i = 0; i < count; i++) {
            String[] data = scanner.nextLine().split(", ");
            String name = data[0];
            int age = Integer.parseInt(data[1]);

            peopleMap.put(name, age);
        }

        String condition = scanner.nextLine();
        int conditionAge = Integer.parseInt(scanner.nextLine());
        String format = scanner.nextLine();

        if (condition.equals("older")) {
            if (format.equals("name age")) {
                peopleMap.entrySet().forEach(e -> {
                    if (e.getValue() >= conditionAge) {
                        System.out.printf("%s - %d\n", e.getKey(), e.getValue());
                    }
                });
            } else if (format.equals("name")) {
                peopleMap.entrySet().forEach(e -> {
                    if (e.getValue() >= conditionAge) {
                        System.out.printf("%s\n", e.getKey());
                    }
                });
            } else {
                peopleMap.entrySet().forEach(e -> {
                    if (e.getValue() >= conditionAge) {
                        System.out.printf("%d\n", e.getValue());
                    }
                });
            }


        } else if (condition.equals("younger")) {
            if (format.equals("name age")) {
                peopleMap.entrySet().forEach(e -> {
                    if (e.getValue() <= conditionAge) {
                        System.out.printf("%s - %d\n", e.getKey(), e.getValue());
                    }
                });
            } else if (format.equals("name")) {
                peopleMap.entrySet().forEach(e -> {
                    if (e.getValue() <= conditionAge) {
                        System.out.printf("%s\n", e.getKey());
                    }
                });
            } else {
                peopleMap.entrySet().forEach(e -> {
                    if (e.getValue() <= conditionAge) {
                        System.out.printf("%d\n", e.getValue());
                    }
                });
            }
        }

    }
}
