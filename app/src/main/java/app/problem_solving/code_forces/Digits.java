package app.problem_solving.code_forces;

import java.util.Scanner;

public class Digits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int remainder = 0;


        for (int i = 0; i < size; i++) {
            int number = scanner.nextInt();
            if (number == 0) {
                System.out.println(0);
                continue;
            }
            while (number != 0) {
                remainder = number % 10;
                System.out.print(remainder + " ");
                number = number / 10;
            }

            System.out.println();
        }

    }

}
