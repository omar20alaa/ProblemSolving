package app.problem_solving.code_forces;

import java.util.Scanner;

public class Bear_Big_Brother {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int value1 = scanner.nextInt();
        int value2 = scanner.nextInt();
        int counter = 0;

        while (value1 <= value2) {
            value1 *= 3;
            value2 *= 2;
            counter++;
        }

        System.out.println(counter);


    }


}
