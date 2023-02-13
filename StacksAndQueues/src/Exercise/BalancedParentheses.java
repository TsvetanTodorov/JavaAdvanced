package Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<Character> openBrackets = new ArrayDeque<>();
        boolean areBalanced = false;


        for (char bracket : input.toCharArray()) {

            if (bracket == '(' || bracket == '[' || bracket == '{') {
                openBrackets.push(bracket);
            } else if (bracket == ')' || bracket == ']' || bracket == '}') {
                if (openBrackets.isEmpty()) {
                    areBalanced = false;
                    break;
                }
                char lastOpenBracket = openBrackets.pop();

                if (lastOpenBracket == '(' && bracket == ')') {
                    areBalanced = true;

                } else if (lastOpenBracket == '[' && bracket == ']') {
                    areBalanced = true;

                } else if (lastOpenBracket == '{' && bracket == '}') {
                    areBalanced = true;

                } else {
                    areBalanced = false;
                    break;
                }
            }
        }

        if (areBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
