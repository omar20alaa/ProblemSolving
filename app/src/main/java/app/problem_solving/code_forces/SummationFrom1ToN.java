package app.problem_solving.code_forces;

import java.util.Scanner;

public class SummationFrom1ToN {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        long sum = ((long) number * (number + 1)) / 2;

        System.out.println(sum);

    }

}
