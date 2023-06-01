package OOP.WorkingWithAbstraction.Lab.StudentSystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CommandExecutor executor = new CommandExecutor();

        while (true) {
            String[] input = scanner.nextLine().split(" ");

            if (CommandExecutor.isExitCommand(input[0])) {
                break;
            }

            executor.executeCommand(input[0], input);

        }
    }
}
