package app.problem_solving.code_masry;

import java.util.Scanner;

class MultiDimensionArrays {

    public static void main(String[] args) {


        int[][] degrees = new int[5][3];
        int [] total_array = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter student #" + i + " degrees");
            for (int j = 0; j < 3; j++) {
              degrees[i][j] =  scanner.nextInt();
            }
        }

        for (int i = 0; i < 5; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += degrees[i][j];
            }
            total_array[i] = sum;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Totals --> " + total_array[i]);
        }

    }

}
