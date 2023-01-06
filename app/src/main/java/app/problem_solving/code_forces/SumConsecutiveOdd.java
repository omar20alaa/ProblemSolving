package app.problem_solving.code_forces;

import java.util.Scanner;

public class SumConsecutiveOdd {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < number; i++) {
            sum = 0;
            int first_number = scanner.nextInt();
            int second_number = scanner.nextInt();
            int max = Math.max(first_number, second_number);
            int min = Math.min(first_number, second_number);
            for (int j = min + 1; j < max; j++) {
                if (j % 2 != 0) {
                    sum += j;
                }
            }
            System.out.println(sum);
        }
    }
}
