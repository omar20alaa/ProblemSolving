package app.problem_solving.code_forces;

import java.util.Scanner;

class ArraySum {

    public static void main(String[] args) {

        System.out.println("Welcome To Array Sum");


        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Size of array");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int max = 0;
        int min = 0;

        for (int i = 0; i < size; i++) {
            System.out.println("Enter Element #" + i);
            arr[i] = scanner.nextInt();
        }

        for (int j : arr) {
            min = arr[0];
            sum += j;
            if (j > max) {
                max = j;
            }
            if (j < min) {
                min = j;
            }
        }

        System.out.println("Sum of array elements --> " + sum);
        System.out.println("Max number in array elements is --> " + max);
        System.out.println("Min number in array elements is --> " + min);

    }


}
