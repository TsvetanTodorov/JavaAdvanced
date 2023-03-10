package SetsAndMaps.Exercise;

import java.util.*;

public class SetsOfElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] data = scanner.nextLine().split(" ");
        int firstSetLength = Integer.parseInt(data[0]);
        int secondSetLength = Integer.parseInt(data[1]);

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();

        for (int i = 0; i < firstSetLength; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            firstSet.add(currentNum);
        }

        for (int i = 0; i < secondSetLength; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            secondSet.add(currentNum);
        }

        Set<Integer> finalSet = new LinkedHashSet<>();

        for (Integer firstSetCurrNum : firstSet) {
            for (Integer secondSetCurrNum : secondSet) {
                if (Objects.equals(firstSetCurrNum, secondSetCurrNum)) {
                    finalSet.add(firstSetCurrNum);
                }
            }
        }

        for (Integer number : finalSet) {
            System.out.print(number + " ");
        }
    }
}
