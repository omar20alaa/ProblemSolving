package app.problem_solving.code_forces;

import java.util.Scanner;

public class SmallestMatrix {


    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter the number of rows in matrix: ");
        int rowsNumber = scanner.nextInt();

        System.out.println("Please enter the number of columns in matrix: ");
        int columnsNumber = scanner.nextInt();

        int[][] matrix = fillMatrix(rowsNumber, columnsNumber);
        System.out.println("The min value is --> " + getSmallestMatrix(matrix));

    }


    public static int[][] fillMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Please enter the value of item in row " + (i + 1) +
                        " and column " + (j + 1));
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static int getSmallestMatrix(int[][] matrix) {
        int min = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }

}
