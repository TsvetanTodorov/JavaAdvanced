package Lab;

import java.util.*;

public class SimpleCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();

        String data = scanner.nextLine();
        String[] dataArr = data.split(" ");
        List<String> dataList = Arrays.asList(dataArr);

        Collections.reverse(dataList);

        for (String currentData : dataList) {
            stack.push(currentData);
        }


        while (stack.size() > 1) {

            int firstNumber = Integer.parseInt(stack.pop());
            String operator = stack.pop();
            int secondNumber = Integer.parseInt(stack.pop());

            int result = 0;
            switch (operator) {
                case "+":
                    result = firstNumber + secondNumber;
                    break;
                case "-":
                    result = firstNumber - secondNumber;
                    break;
            }
            stack.push("" + result);
        }
        System.out.println(stack.peek());
    }
}
