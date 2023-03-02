package StacksAndQueues.Exercise.Lab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> queue = new ArrayDeque<>();

        String[] names = scanner.nextLine().split(" ");
        int steps = Integer.parseInt(scanner.nextLine());
        Collections.addAll(queue, names);

        while (queue.size() > 1) {

            for (int i = 1; i < steps; i++) {
                String kid = queue.poll();
                queue.offer(kid);
            }


            String removedChild = queue.poll();
            System.out.println("Removed " + removedChild);
        }

        System.out.println("Last is " + queue.poll());
    }
}
