package OOP.WorkingWithAbstraction.Exercise.CardSuit;

public class Main {
    public static void main(String[] args) {

        CardSuits[] values = CardSuits.values();
        System.out.println("Card Suits:");
        for (CardSuits value : values) {
            System.out.printf("Ordinal value: %d; Name value: %s\n", value.ordinal(), value.name());
        }

    }
}
