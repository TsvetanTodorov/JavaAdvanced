package OOP.WorkingWithAbstraction.Lab.StudentSystem;

public class Student {
    private final String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        String studentType = "Very nice person.";

        if (this.getGrade() >= 5.00) {
            studentType = "Excellent student.";
        } else if (this.getGrade() < 5.00 && this.getGrade() >= 3.50) {
            studentType = "Average student.";
        }
        return String.format("%s is %s years old. %s", this.getName(), this.getAge(), studentType);
    }

}
