package SetsAndMaps.Lab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<Double, Integer> occurrences = new LinkedHashMap<>();

        String[] numbers = scanner.nextLine().split(" ");
        for (String number : numbers) {
            double currentNum = Double.parseDouble(number);

            if (!occurrences.containsKey(currentNum)) {
                occurrences.put(currentNum, 1);
            } else {
                int count = occurrences.get(currentNum);
                occurrences.put(currentNum, count + 1);
            }
        }

        for (Double number : occurrences.keySet()) {
            System.out.printf("%.1f -> %d\n", number, occurrences.get(number));
        }
    }
}
