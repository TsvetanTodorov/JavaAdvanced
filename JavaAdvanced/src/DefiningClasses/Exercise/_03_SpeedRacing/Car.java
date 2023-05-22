package DefiningClasses.Exercise._03_SpeedRacing;

public class Car {

    private String model;
    private double fuelAmount;
    private double consumptionFuelPerKm;
    private int distanceTraveled;


    public Car(String model, double fuelAmount, double priceFuelPerKm) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.consumptionFuelPerKm = priceFuelPerKm;
        this.distanceTraveled = 0;
    }

    public boolean drive(int kmToDrive) {
        double needFUel = kmToDrive * this.consumptionFuelPerKm;
        if (needFUel <= this.fuelAmount) {
            this.fuelAmount -= needFUel;
            this.distanceTraveled += kmToDrive;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d", this.model, this.fuelAmount, this.distanceTraveled);
    }
}
