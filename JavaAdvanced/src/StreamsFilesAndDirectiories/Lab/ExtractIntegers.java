package StreamsFilesAndDirectiories.Lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) throws FileNotFoundException {

        String basePath = "/Users/tsvetantodorov/Downloads/04-2/Files-and-Streams";
        String inputPath = basePath + "/input.txt";
        String outputPath = basePath + "/_04output.txt";

        Scanner reader = new Scanner(new FileInputStream(inputPath));
        PrintStream writer = new PrintStream(new FileOutputStream(outputPath));


        while (reader.hasNext()) {
            if (reader.hasNextInt()) {
                writer.println(reader.nextInt());
            }

            reader.next();

        }

    }
}
