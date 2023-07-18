package OOP.Interfaces.Lab.Ferrari;

public class Ferrari implements Car {

    private String driverName;
    private final String MODEL = "488-Spider";

    public Ferrari(String driverName) {
        this.driverName = driverName;

    }


    @Override
    public String brakes() {
        return "Brakes!";
    }

    @Override
    public String gas() {
        return "brum-brum- brum-brrrrr";
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(MODEL);
        sb.append("/");
        sb.append(brakes());
        sb.append("/");
        sb.append(gas());
        sb.append("/");
        sb.append(driverName);

        return sb.toString();
    }
}
