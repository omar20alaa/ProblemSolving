package app.problem_solving.code_forces;

import java.util.Scanner;

public class Games {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] first_arr = new int[size];
        int[] second_arr = new int[size];
        int counter = 0;

        for (int i = 0; i < size; i++) {
            first_arr[i] = scanner.nextInt();
            second_arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (first_arr[i] == second_arr[j]) {
                    counter++;
                }
            }
        }

        System.out.println(counter);


    }


}
