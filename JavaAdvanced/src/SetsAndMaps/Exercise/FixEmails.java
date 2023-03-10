package SetsAndMaps.Exercise;

import java.util.*;

public class FixEmails {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        Map<String, String> emails = new LinkedHashMap<>();


        while (!name.equals("stop")) {

            String email = scanner.nextLine();

            if (!email.endsWith("uk") && !email.endsWith("us") && !email.endsWith("com")) {
                emails.put(name, email);
            }

            name = scanner.nextLine();
        }

        emails.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
