package app.problem_solving.code_forces;

import java.util.Scanner;

class ArrayReversed {

    public static void main(String[] args) {

        System.out.println("Welcome To Array Reversed");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Size of array");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter Element #" + i);
            arr[i] = scanner.nextInt();
        }

        for (int j = size-1; j >= 0; j--) {
            System.out.print(arr[j] + " ");
        }


    }


}
