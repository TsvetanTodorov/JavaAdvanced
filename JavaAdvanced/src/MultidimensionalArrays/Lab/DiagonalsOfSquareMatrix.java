package MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalsOfSquareMatrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[size][];

        for (int row = 0; row < size; row++) {
            String[] columnData = scanner.nextLine().split(" ");


            int[] currentRow = Arrays.stream(columnData)
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix[row] = currentRow;
        }

        //Top left to bottom right
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
        //Bottom left to top right
        for (int row = size - 1, col = 0; col < size; row--, col++) {
            System.out.print(matrix[row][col] + " ");

        }
    }
}
