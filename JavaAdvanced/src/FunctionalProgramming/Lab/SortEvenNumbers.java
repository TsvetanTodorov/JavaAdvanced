package FunctionalProgramming.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortEvenNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> listOfNumbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(elem -> Integer.parseInt(elem))
                .collect(Collectors.toList());

        listOfNumbers.removeIf(num -> isOdd(num));
        listOfNumbers.forEach(num -> {
            if (listOfNumbers.indexOf(num) == listOfNumbers.size() - 1) {
                System.out.println(num);
            } else {
                System.out.print(num + ", ");
            }
        });
        listOfNumbers.sort(Integer::compareTo);


        listOfNumbers.forEach(num -> {
            if (listOfNumbers.indexOf(num) == listOfNumbers.size() - 1) {
                System.out.println(num);
            } else {
                System.out.print(num + ", ");
            }
        });
    }


    private static boolean isOdd(int num) {
        return num % 2 != 0;
    }
}
