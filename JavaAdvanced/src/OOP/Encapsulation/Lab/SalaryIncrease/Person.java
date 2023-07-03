package OOP.Encapsulation.Lab.SalaryIncrease;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double bonus) {

        double bonusReduced = age < 30 ? bonus / 2 : bonus;

        double factor = 1.00 + bonusReduced / 100;

        salary = salary * factor;
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %.2f leva", firstName, lastName, salary);
    }

}
