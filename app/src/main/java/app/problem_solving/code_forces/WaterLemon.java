package app.problem_solving.code_forces;

import java.util.Scanner;

public class WaterLemon {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number <= 2) {
            System.out.println("NO");
            return;
        }
        if (number % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
