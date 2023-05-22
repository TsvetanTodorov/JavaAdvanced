package DefiningClasses.Exercise._03_SpeedRacing;

public class Car {

    private String model;
    private double fuelAmount;
    private double fuelConsumptionPerKm;
    private int distanceTraveled = 0;


    public Car(String model, double fuelAmount, double fuelConsumptionPerKm) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelConsumptionPerKm = fuelConsumptionPerKm;
    }

    public String getModel() {
        return model;
    }

    public void drive(int kmToDrive) {
        fuelAmount -= calculateNeededFuel(kmToDrive);
        distanceTraveled += kmToDrive;
    }

    public boolean hasEnoughFuel(int kmToDrive) {
        return calculateNeededFuel(kmToDrive) <= fuelAmount;
    }


    public void printInfo(){
        System.out.printf("%s %.2f %d\n", model, fuelAmount, distanceTraveled);
    }



    private double calculateNeededFuel(int kmToDrive) {
        return kmToDrive * fuelConsumptionPerKm;
    }
}
