package DefiningClasses.Lab._01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] carParts = scanner.nextLine().split(" ");

            Car car;
            if (carParts.length > 1) {
                int hp = Integer.parseInt(carParts[2]);
                car = new Car(carParts[0], carParts[1], hp);
            } else {
                car = new Car(carParts[0]);
            }



            System.out.println(car.carInfo());
        }

    }

}
