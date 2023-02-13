package Exercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pushElements = scanner.nextInt();
        int popElements = scanner.nextInt();
        int checkElement = scanner.nextInt();

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        for (int i = 1; i <= pushElements; i++) {
            numbers.push(scanner.nextInt());
        }

        for (int i = 1; i <= popElements; i++) {
            numbers.pop();
        }

        if (numbers.contains(checkElement)) {
            System.out.println("true");
        } else {
            if (numbers.isEmpty()) {
                System.out.println(0);
            } else {
                System.out.println(Collections.min(numbers));
            }

        }


    }
}
