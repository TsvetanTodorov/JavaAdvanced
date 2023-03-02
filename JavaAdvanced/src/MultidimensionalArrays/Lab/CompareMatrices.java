package MultidimensionalArrays.Lab;

import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String[] inputDimensions = scanner.nextLine().split(" ");

        int firstRow = Integer.parseInt(inputDimensions[0]);
        int firstCol = Integer.parseInt(inputDimensions[1]);
        int[][] firstMatrix = new int[firstRow][firstCol];

        for (int i = 0; i < firstRow; i++) {
            String[] parts = scanner.nextLine().split(" ");

            for (int j = 0; j < firstCol; j++) {
                firstMatrix[i][j] = Integer.parseInt(parts[j]);
            }
        }

        inputDimensions = scanner.nextLine().split(" ");
        int secondRow = Integer.parseInt(inputDimensions[0]);
        int secondCol = Integer.parseInt(inputDimensions[1]);
        int secondMatrix[][] = new int[secondRow][secondCol];

        for (int i = 0; i < secondRow; i++) {
            String[] parts = scanner.nextLine().split(" ");

            for (int j = 0; j < secondCol; j++) {
                secondMatrix[i][j] = Integer.parseInt(parts[j]);
            }
        }


        boolean areEqual = true;

        if (firstRow != secondRow || firstCol != secondCol) {
            areEqual = false;
        } else {
            for (int i = 0; i < firstRow; i++) {
                for (int j = 0; j < firstCol; j++) {
                    if (firstMatrix[i][j] != secondMatrix[i][j]) {
                        areEqual = false;
                    }
                }
            }
        }


        if (areEqual) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

    }
}
