package OOP.Interfaces.Lab.CarShopExtended;

public class Audi extends CarImlp implements Rentable {

    private Integer mindRentDay;
    private Double pricePerDay;

    public Audi(String model,
                String color,
                Integer horsePower,
                String countryProduced,
                Integer mindRentDay,
                Double pricePerDay) {
        super(model, color, horsePower, countryProduced);
        this.mindRentDay = mindRentDay;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public Integer getMinRentDay() {
        return this.mindRentDay;
    }

    @Override
    public Double getPricePerDay() {
        return this.pricePerDay;
    }


    @Override
    public String toString() {
        String pattern = "Minimum rental period of %d days. Price per day %f";
        return String.format(pattern,this.getMinRentDay(),this.getPricePerDay());
    }
}
