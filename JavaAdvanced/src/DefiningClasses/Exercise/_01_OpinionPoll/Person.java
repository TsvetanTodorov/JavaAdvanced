package DefiningClasses.Exercise._01_OpinionPoll;

public class Person {

    private String name;

    private int age;



    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public Person(String name) {
        this.name = name;
        this.age = 0;
    }

    public Person(int age) {
        this.name = "unknown";
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return this.name;
    }


    public boolean isOlderThanFifty() {
        return this.age > 50;
    }


    public void introduceYourself(){
        System.out.println("I am a person!");
    }

}
