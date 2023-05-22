package DefiningClasses.Exercise._03_SpeedRacing;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Garage {
    private List<Car> cars = new ArrayList<>();


    public void addCar(Car car) {
        cars.add(car);
    }

    public Car getCar(String model) {
        return cars.stream()
                .filter(currentCar -> currentCar.getModel().equals(model))
                .collect(Collectors.toList()).get(0);
    }

    public void printCars(){
        cars.forEach(Car::printInfo);
    }

}
