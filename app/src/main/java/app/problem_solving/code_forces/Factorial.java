package app.problem_solving.code_forces;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(factorial(scanner.nextInt()));
    }

    private static int factorial(int number) {
        if (number > 0) {
            return number * factorial(number - 1);
        } else
            return 1;
    }

}
