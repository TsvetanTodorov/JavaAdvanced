package StreamsFilesAndDirectiories.Exercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SumLines {
    public static void main(String[] args) throws IOException {

        String pathToFIle = "/Users/tsvetantodorov/Downloads/04. Java-Advanced-Files-and-Streams-Exercises-Resources/input.txt";
        List<String> allLines = Files.readAllLines(Path.of(pathToFIle));


        for (String line : allLines) {
            int sum = 0;
            for (char symbol : line.toCharArray()) {
                sum += symbol;
            }
            System.out.println(sum);
        }

    }
}
