package SetsAndMaps.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class PeriodicTable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = Integer.parseInt(scanner.nextLine());
        Set<String> chemicals = new TreeSet<>();

        for (int i = 0; i < counter; i++) {
            List<String> elements = Arrays
                    .stream(scanner.nextLine().split(" "))
                    .collect(Collectors.toList());
            chemicals.addAll(elements);
        }

        for (String ele : chemicals) {
            System.out.print(ele + " ");
        }
    }
}
