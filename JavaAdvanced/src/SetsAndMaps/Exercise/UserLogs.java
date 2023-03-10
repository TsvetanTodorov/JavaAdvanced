package SetsAndMaps.Exercise;

import java.util.*;

public class UserLogs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        TreeMap<String, LinkedHashMap<String, Integer>> data = new TreeMap<>();

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            // input = "IP={IP.Address} message={A&sample&message} user={username}";

            String ip = input.split("\\s+")[0].split("=")[1];
            String message = input.split("\\s+")[1].split("=")[1];
            String username = input.split("\\s+")[2].split("=")[1];

            if (!data.containsKey(username)) {
                data.put(username, new LinkedHashMap<>());
            }

            Map<String, Integer> currentIps = data.get(username);

            if (!currentIps.containsKey(ip)) {
                currentIps.put(ip, 1);
            } else {
                currentIps.put(ip, currentIps.get(ip) + 1);
            }

            input = scanner.nextLine();
        }

        for (String username : data.keySet()) {
            System.out.println(username + ": ");

            Map<String, Integer> currentIps = data.get(username);
            int countIps = currentIps.size();

            for (String ip : currentIps.keySet()) {
                if (countIps == 1) {
                    System.out.println(ip + " => " + currentIps.get(ip) + ".");
                } else {
                    System.out.println(ip + " => " + currentIps.get(ip) + ", ");
                }
                countIps--;
            }
        }
    }
}
