package SetsAndMaps.Lab;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class CardGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Set<Integer> deckOne = new LinkedHashSet<>();
        Set<Integer> deckTwo = new LinkedHashSet<>();

        String[] inputOne = scanner.nextLine().split(" ");
        for (int i = 0; i < inputOne.length; i++) {
            int currentNum = Integer.parseInt(inputOne[i]);
            deckOne.add(currentNum);
        }


        String[] inputTwo = scanner.nextLine().split(" ");
        for (int i = 0; i < inputTwo.length; i++) {
            int currentNum = Integer.parseInt(inputTwo[i]);
            deckTwo.add(currentNum);
        }


        int step = 1;
        while (!deckOne.isEmpty() && !deckTwo.isEmpty()) {
            if (step >= 50) {
                if (deckTwo.size() > deckOne.size()) {
                    System.out.println("Second player win!");
                } else if (deckOne.size() > deckTwo.size()) {
                    System.out.println("First player win!");
                } else {
                    System.out.println("Draw!");
                }
                return;
            }

            Integer fighterOne = deckOne.iterator().next();
            Integer fighterTwo = deckTwo.iterator().next();

            deckOne.remove(fighterOne);
            deckTwo.remove(fighterTwo);

            if (fighterOne > fighterTwo) {
                deckOne.add(fighterOne);
                deckOne.add(fighterTwo);
            } else if (fighterTwo > fighterOne) {
                deckTwo.add(fighterOne);
                deckTwo.add(fighterTwo);
            }

            step++;
        }

        if (deckOne.isEmpty()) {
            System.out.println("Second player win!");
        } else {
            System.out.println("First player win!");
        }


    }
}
