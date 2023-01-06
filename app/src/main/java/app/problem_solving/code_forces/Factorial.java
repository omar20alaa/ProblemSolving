package app.problem_solving.code_forces;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();

        if (number == 1) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
