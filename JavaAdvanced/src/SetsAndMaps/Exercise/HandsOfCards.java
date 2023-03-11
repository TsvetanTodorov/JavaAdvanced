package SetsAndMaps.Exercise;

import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Set<String>> cards = new LinkedHashMap<>();

        while (!input.equals("JOKER")) {

            String name = input.split(":")[0];
            HashSet<String> cardsToAdd = new HashSet<>(Arrays.asList((input.split(": ")[1]).split(", ")));

            cards.putIfAbsent(name, new HashSet<>());
            cards.get(name).addAll(cardsToAdd);

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Set<String>> entry : cards.entrySet()) {
            System.out.printf("%s: %d\n", entry.getKey(), calculateTotalPower(entry.getValue()));
        }
    }

    private static int calculateTotalPower(Set<String> cards) {
        int totalPower = 0;
        for (String card : cards) {
            String power = card.substring(0, card.length() - 1);
            String type = String.valueOf(card.charAt(card.length() - 1));

            switch (power) {
                case "J":
                    power = "11";
                    break;
                case "Q":
                    power = "12";
                    break;
                case "K":
                    power = "13";
                    break;
                case "A":
                    power = "14";
                    break;
            }

            switch (type) {
                case "S":
                    type = "4";
                    break;
                case "H":
                    type = "3";
                    break;
                case "D":
                    type = "2";
                    break;
                case "C":
                    type = "1";
                    break;
            }

            totalPower += Integer.parseInt(power) * Integer.parseInt(type);
        }

        return totalPower;
    }
}
