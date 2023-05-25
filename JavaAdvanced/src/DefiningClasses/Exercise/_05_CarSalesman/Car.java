package DefiningClasses.Exercise._05_CarSalesman;

public class Car {
    private String model;
    private Engine engine;
    private int weight;
    private String color;


    public Car(String model, Engine engine, int weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }


    public void printInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(model).append(":").append(System.lineSeparator());
        sb.append(engine.getModel()).append(":").append(System.lineSeparator());
        sb.append("Power: ").append(engine.getPower()).append(System.lineSeparator());
        sb.append("Displacement: ");
        if (engine.isDisplacementEqualsZero()) {
            sb.append("n/a").append(System.lineSeparator());
        } else {
            sb.append(engine.getDisplacement()).append(System.lineSeparator());
        }
        sb.append("Efficiency: ");
        if (engine.isEfficiencyEqualsNull()) {
            sb.append("n/a").append(System.lineSeparator());
        } else {
            sb.append(engine.getEfficiency()).append(System.lineSeparator());
        }
        sb.append("Weight: ");
        if (isWeightEqualsZero()) {
            sb.append("n/a").append(System.lineSeparator());
        } else {
            sb.append(weight).append(System.lineSeparator());
        }
        sb.append("Color: ");
        if (isColorEqualsNull()) {
            sb.append("n/a");
        } else {
            sb.append(color);
        }
        System.out.println(sb);
    }


    private boolean isWeightEqualsZero() {
        return weight == 0;
    }

    private boolean isColorEqualsNull() {
        return color == null;
    }
}
