package Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputArr = input.split(" ");

        ArrayDeque<Integer> numbersStack = new ArrayDeque<>();

        for (int i = 0; i <= inputArr.length - 1; i++) {
            int currentNumber = Integer.parseInt(inputArr[i]);

            numbersStack.push(currentNumber);

        }
        for (Integer num : numbersStack) {
            System.out.print(num + " ");
        }
    }
}
