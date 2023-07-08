package OOP.Encapsulation.Exercise.AnimalFarm;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        setName(name);
        setAge(age);
    }

    public void setName(String name) {
        if (name.equals(" ") || name.length() == 0) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0 || age > 15) {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    private double calculateProductPerDay() {
        if (age >= 0 && age <= 5) {
            return 2.00;
        } else if (age > 5 && age <= 11) {
            return 1.00;
        } else {
            return 0.75;
        }
    }

    public double productPerDay() {
        return calculateProductPerDay();
    }



}
