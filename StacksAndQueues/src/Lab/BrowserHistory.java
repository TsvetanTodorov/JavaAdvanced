package Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> urlsStack = new ArrayDeque<>();

        String command = scanner.nextLine();

        while (!command.equals("Home")) {

            if (command.equals("back")) {
                if (urlsStack.isEmpty() || urlsStack.size() == 1) {
                    System.out.println("no previous URLs");
                    command = scanner.nextLine();
                    continue;
                }

                urlsStack.pop();

            } else {
                urlsStack.push(command);
            }
            System.out.println(urlsStack.peek());

            command = scanner.nextLine();
        }
    }
}
