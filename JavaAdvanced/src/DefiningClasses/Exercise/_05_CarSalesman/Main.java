package DefiningClasses.Exercise._05_CarSalesman;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Engines engines = new Engines();

        int enginesCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < enginesCount; i++) {

            String[] engineData = scanner.nextLine().split("\\s+");
            String model = engineData[0];
            int power = Integer.parseInt(engineData[1]);
            int displacement = 0;
            String efficiency = null;

            if (engineData.length == 4) {
                displacement = Integer.parseInt(engineData[2]);
                efficiency = engineData[3];
            } else if (engineData.length == 3) {
                if (Character.isDigit(engineData[2].charAt(0))) {
                    displacement = Integer.parseInt(engineData[2]);
                } else {
                    efficiency = engineData[2];
                }
            }

            Engine engine = new Engine(model, power, displacement, efficiency);
            engines.addEngine(engine);
        }

        int carsCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < carsCount; i++) {
            String[] carData = scanner.nextLine().split("\\s+");
            String carModel = carData[0];
            String engineModel = carData[1];
            int weight = 0;
            String color = null;

            if (carData.length == 4) {
                weight = Integer.parseInt(carData[2]);
                color = carData[3];
            } else if (carData.length == 3) {
                if (Character.isDigit(carData[2].charAt(0))) {
                    weight = Integer.parseInt(carData[2]);
                } else {
                    color = carData[2];
                }
            }

            Engine carEngine = engines.getEngineByModel(engineModel);
            if (carEngine == null) {
                System.out.println("Sorry! We didn't find an engine with model: " + engineModel);
                continue;
            }


            Car car = new Car(carModel, carEngine, weight, color);
            car.printInfo();
        }
    }
}
