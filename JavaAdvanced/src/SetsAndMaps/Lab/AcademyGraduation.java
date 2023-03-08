package SetsAndMaps.Lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AcademyGraduation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int studentsCount = Integer.parseInt(scanner.nextLine());
        Map<String, Double[]> gradesPerStudent = new TreeMap<>();

        for (int i = 0; i < studentsCount; i++) {
            String name = scanner.nextLine();
            String[] inputGrades = scanner.nextLine().split(" ");
            Double[] grades = new Double[inputGrades.length];

            for (int j = 0; j < inputGrades.length; j++) {
                grades[j] = Double.parseDouble(inputGrades[j]);
            }

            gradesPerStudent.put(name, grades);
        }
        DecimalFormat format = new DecimalFormat("0.#####");
        for (String studentName : gradesPerStudent.keySet()) {
            Double[] grades = gradesPerStudent.get(studentName);
            double sum = 0;

            for (Double grade : grades) {
                sum += grade;
            }

            double averageGrade = sum / grades.length;


            System.out.printf("%s is graduated with: %s\n", studentName, format.format(averageGrade));
        }
    }
}
