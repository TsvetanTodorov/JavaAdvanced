package FunctionalProgramming.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SumNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Function<String, Integer> parse = s -> Integer.parseInt(s);

        List<Integer> listOfNumbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(elem -> parse.apply(elem))
                .collect(Collectors.toList());


        int sum = listOfNumbers
                .stream()
                .mapToInt(a -> a)  //identity function
                .sum();


        System.out.printf("Count = %d\n", listOfNumbers.size());
        System.out.printf("Sum = %d", sum);
    }
}
