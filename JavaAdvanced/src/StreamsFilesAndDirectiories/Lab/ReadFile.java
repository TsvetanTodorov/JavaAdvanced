package StreamsFilesAndDirectiories.Lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String filePath = "/Users/tsvetantodorov/Downloads/04. Java-Advanced-Files-and-Streams-Lab-Resources/input.txt";

        try (InputStream inputStream = new FileInputStream(filePath)) {
            int readByte = inputStream.read();

            while (readByte >= 0) {
                System.out.print(Integer.toBinaryString(readByte) + " ");

                readByte = inputStream.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


//        InputStream inputStream = new FileInputStream(filePath);
//        int firstByte = inputStream.read();
//        System.out.println(firstByte);
//        System.out.println((char) firstByte);
//
//        inputStream.close();
    }
}
