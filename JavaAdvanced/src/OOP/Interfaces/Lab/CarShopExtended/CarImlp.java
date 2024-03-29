package OOP.Interfaces.Lab.CarShopExtended;

public class CarImlp implements Car {
    private String model;
    private String color;
    private Integer horsePower;
    private String countryProduced;

    public CarImlp(String model,
                String color,
                Integer horsePower,
                String countryProduced) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.countryProduced = countryProduced;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public Integer getHorsePower() {
        return this.horsePower;
    }

    @Override
    public String countryProduced() {
        return this.countryProduced;
    }

    @Override
    public String toString() {
        String pattern = "This is %s produced in %s and have %d tires";

        return String.format(pattern, this.getModel(), this.countryProduced(), TIRES);
    }
}
