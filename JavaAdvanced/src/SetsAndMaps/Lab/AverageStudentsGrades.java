package SetsAndMaps.Lab;

import java.util.*;

public class AverageStudentsGrades {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int studentsCount = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> avgStudentsGrades = new TreeMap<>();


        for (int i = 0; i < studentsCount; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            double grade = Double.parseDouble(input[1]);

            if (!avgStudentsGrades.containsKey(name)) {
                avgStudentsGrades.put(name, new ArrayList<>());
                avgStudentsGrades.get(name).add(grade);
            } else {
                avgStudentsGrades.get(name).add(grade);
            }
        }

        avgStudentsGrades.entrySet()
                .stream()
                .forEach(entry -> {
                    double sum = 0;
                    for (int i = 0; i < entry.getValue().size(); i++) {
                        sum += entry.getValue().get(i);
                    }
                    double avgSum = sum / entry.getValue().size();

                    System.out.print(entry.getKey() + " -> ");
                    entry.getValue().forEach(e -> System.out.printf("%.2f ", e));
                    System.out.printf("(avg: %.2f)%n", avgSum);
                });
    }
}
