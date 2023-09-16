package app.problem_solving.code_forces;

import java.util.Scanner;

public class Magnets {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int oldNum = 0;
        int newNum;
        int counter = 0;
        for (int i = 0; i < num; i++) {
            newNum = scanner.nextInt();
            if (newNum != oldNum) {
                counter++;
            }
            oldNum = newNum;
        }
        System.out.println(counter);
    }

}
