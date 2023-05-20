package DefiningClasses.Exercise._01_OpinionPoll;

public class Employee extends Person {

    private String id;

    public Employee(String name, int age, String id) {
        super(name, age);
        this.id = id;
    }

    public Employee(String name, int age) {
        super(name, age);
        this.id = String.valueOf(Math.random());
    }

    public String getId() {
        return id;
    }

    @Override
    public void introduceYourself(){
        System.out.println("I am an employee!");
    }
}
