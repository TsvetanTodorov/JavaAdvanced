package OOP.Inheritance.Lab.StackOfStrings;

import java.util.ArrayList;

public class Stack {

    private ArrayList<String> data;


    public Stack() {
        this.data = new ArrayList<>();
    }

    public void push(String item) {
        this.data.add(item);
    }

    public String pop() {
        String peek = this.peek();
        this.data.remove(this.data.size() - 1);
        return peek;
    }

    public String peek() {
        return this.data.get(this.data.size() - 1);
    }

    public boolean isEmpty() {
        return this.data.size() == 0;
    }
}
