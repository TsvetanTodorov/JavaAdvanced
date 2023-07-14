package OOP.Inheritance.Lab.StackOfStrings;

public class Main {
    public static void main(String[] args) {


        Stack stack = new Stack();
        stack.push("Goshko");
        stack.push("Maria");
        stack.push("Stamat");

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());


    }
}
