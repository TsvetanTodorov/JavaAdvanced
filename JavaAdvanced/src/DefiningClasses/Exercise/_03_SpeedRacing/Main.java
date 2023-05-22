package DefiningClasses.Exercise._03_SpeedRacing;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countCars = Integer.parseInt(scanner.nextLine());
        Garage garage = new Garage();

        for (int i = 0; i < countCars; i++) {
            String[] data = scanner.nextLine().split("\\s+");

            String model = data[0];
            double fuelAmount = Double.parseDouble(data[1]);
            double consumption = Double.parseDouble(data[2]);

            Car car = new Car(model, fuelAmount, consumption);
            garage.addCar(car);
        }

        String command = scanner.nextLine();

        while (!command.equals("End")) {

            String carModelToDrive = command.split("\\s+")[1];
            int kmToDrive = Integer.parseInt(command.split("\\s+")[2]);

            Car currentCar = garage.getCar(carModelToDrive); // change

            if (currentCar.hasEnoughFuel(kmToDrive)) {
                currentCar.drive(kmToDrive);
            } else {
                System.out.println("Insufficient fuel for the drive");
            }

            command = scanner.nextLine();
        }

        garage.printCars();
    }
}
