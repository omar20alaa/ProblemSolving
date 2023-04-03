package app.problem_solving.code_forces;

import java.util.Scanner;

public class dominoPiling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_1 = scanner.nextInt();
        int num_2 = scanner.nextInt();
        long result = num_1 * num_2;
        System.out.println(result / 2);
    }
}
