package app.problem_solving.code_forces;

import java.util.Scanner;

public class LongWords {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            String value = scanner.next();

            if (value.toCharArray().length > 10) {
                System.out.println(value.toCharArray()[0] +"" + (value.toCharArray().length - 2) + value.toCharArray()[value.length() -1]);
            }
            System.out.println(value);
        }

    }

}
