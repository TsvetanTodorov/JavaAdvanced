package DefiningClasses.Exercise._02_CompanyRoster;

public class Employee {

    private String name;
    private double salary;
    private String position;
    private String department;
    private String email;
    private int age;

    public Employee(String name, double salary, String position, String department) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.age = -1;
        this.email = "n/a";
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getDepartment() {
        return this.department;
    }

    public double getSalary() {
        return salary;
    }

    public void printInfo() {
        System.out.printf("%s %.2f %s %d\n", name, salary, email, age);
    }
}
