package StreamsFilesAndDirectiories.Exercise;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class AllCapitals {
    public static void main(String[] args) throws IOException {


        String pathToFIle = "/Users/tsvetantodorov/Downloads/04. Java-Advanced-Files-and-Streams-Exercises-Resources/input.txt";
        List<String> allLines = Files.readAllLines(Path.of(pathToFIle));
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

        for (String line:allLines){
           writer.write(line.toUpperCase());
           writer.newLine();
        }
        writer.close();
    }
}
