package OOP.Encapsulation.Lab.ValidationData;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setSalary(salary);
    }

    public void setFirstName(String firstName) {
        ensureNameLength(firstName, "First");

        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        ensureNameLength(lastName, "Last");

        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalStateException("Age cannot be zero or negative integer");
        }
        this.age = age;
    }

    public void setSalary(double salary) {
        if (salary < 460){
            throw new IllegalStateException("Salary cannot be less than 460 leva");
        }
            this.salary = salary;
    }

    private void ensureNameLength(String name, String messagePrefix) {
        if (name.length() < 3) {
            throw new IllegalArgumentException(messagePrefix + " name cannot be less than 3 symbols");
        }
    }

//    public void increaseSalary(double bonus) {
//
//        double bonusReduced = age < 30 ? bonus / 2 : bonus;
//
//        double factor = 1.00 + bonusReduced / 100;
//
//        salary = salary * factor;
//    }
}
