package app.problem_solving.code_forces;

import java.util.Scanner;

public class WrongSubtraction {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();
        int operation = scanner.nextInt();
        int last_num;
        for (int i = 0; i < operation; i++) {
            last_num = Math.abs(digit) % 10;
            if (last_num == 0)
                digit /= 10;
            else
                digit -= 1;
        }
        System.out.println("digit --> " + digit);
    }

}
