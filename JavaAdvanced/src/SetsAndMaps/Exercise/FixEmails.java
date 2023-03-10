package SetsAndMaps.Exercise;

import java.util.*;

public class FixEmails {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        Map<String, String> emails = new LinkedHashMap<>();


        while (!name.equals("stop")) {

            String email = scanner.nextLine();
            String[] emailArr = email.split("\\.");
            String domain = emailArr[emailArr.length - 1];

            if (!domain.equals("uk") && !domain.equals("us") && !domain.equals("com")) {
                emails.put(name, email);
            }

            name = scanner.nextLine();
        }

        for (String currName : emails.keySet()) {
            System.out.printf("%s -> %s\n", currName, emails.get(currName));

        }
    }
}
