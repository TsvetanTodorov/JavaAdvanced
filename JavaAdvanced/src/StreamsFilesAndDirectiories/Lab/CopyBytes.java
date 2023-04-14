package StreamsFilesAndDirectiories.Lab;

import java.io.*;

public class CopyBytes {
    public static void main(String[] args) throws FileNotFoundException {


        String basePath = "/Users/tsvetantodorov/Downloads/04-2/Files-and-Streams";
        String inputPath = basePath + "/input.txt";
        String outputPath = basePath + "/_03output.txt";

        try (InputStream inputStream = new FileInputStream(inputPath);
             OutputStream outputStream = new FileOutputStream(outputPath)) {
            int readByte = inputStream.read();

            while (readByte >= 0) {

                if (readByte == 10 || readByte == 32) {
                    outputStream.write(readByte);
                } else {
                    String number = String.valueOf(readByte);
                    for (int i = 0; i < number.length(); i++) {
                        outputStream.write(number.charAt(i));
                    }

                }
                readByte = inputStream.read();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
