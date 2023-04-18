package StreamsFilesAndDirectiories.Exercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SumBytes {
    public static void main(String[] args) throws IOException {

        String pathToFIle = "/Users/tsvetantodorov/Downloads/04. Java-Advanced-Files-and-Streams-Exercises-Resources/input.txt";
        List<String> allLines = Files.readAllLines(Path.of(pathToFIle));

        long sum = 0;
        for (String line : allLines) {
            for (char symbol : line.toCharArray()) {
                sum += symbol;
            }
        }

        System.out.println(sum);


    }
}
