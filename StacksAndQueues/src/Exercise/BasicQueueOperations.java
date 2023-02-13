package Exercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pushElements = scanner.nextInt();
        int popElements = scanner.nextInt();
        int checkElement = scanner.nextInt();

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 1; i <= pushElements; i++) {
            queue.offer(scanner.nextInt());
        }

        for (int i = 1; i <= popElements; i++) {
            queue.poll();
        }

        if (queue.contains(checkElement)) {
            System.out.println("true");
        } else {
            if (queue.isEmpty()) {
                System.out.println(0);
            } else {
                System.out.println(Collections.min(queue));
            }

        }
    }
}
