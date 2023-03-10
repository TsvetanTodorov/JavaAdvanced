package SetsAndMaps.Exercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = Integer.parseInt(scanner.nextLine());
        Set<String> usernames = new LinkedHashSet<>();

        for (int i = 0; i < counter; i++) {

            String currentUsername = scanner.nextLine();

            usernames.add(currentUsername);

        }
        usernames.forEach(System.out::println);
    }
}
