package app.problem_solving.code_masry;

import java.util.Scanner;

class MatrixMultiplication {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Matrix size");
        int size = scanner.nextInt();
        
        int [][] x = new int[size][size];
        int [][] y = new int[size][size];
        int [][] z = new int[size][size];


        System.out.println("Enter matrix x elements : ");
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                System.out.println("Enter element at " + row + " " + column);
                x[row][column] = scanner.nextInt();
            }
        }

        System.out.println("Enter matrix y elements : ");
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                System.out.println("Enter element at " + row + " " + column);
                y[row][column] = scanner.nextInt();
            }
        }


        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                int sum = 0;
                for (int i = 0; i < size; i++) {
                    sum += x[row][i] * y[i][column];
                }
                z[row][column] = sum;
            }
        }

        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                System.out.print(z[row][column] + "\t");
            }
            System.out.println("");
        }



    }
}
