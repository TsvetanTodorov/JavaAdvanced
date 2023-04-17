package StreamsFilesAndDirectiories.Lab;

import java.io.*;

public class WriteEveryThirdLine {
    public static void main(String[] args) {

        String basePath = "/Users/tsvetantodorov/Downloads/04-2/Files-and-Streams";
        String inputPath = basePath + "/input.txt";
        String outputPath = basePath + "/_05output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));
             PrintStream writer = new PrintStream(new FileOutputStream(outputPath))) {

            int lineCounter = 1;
            String line = reader.readLine();
            while (line != null) {
                if (lineCounter % 3 == 0) {
                    writer.println(line);
                }

                line = reader.readLine();
                lineCounter++;
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
