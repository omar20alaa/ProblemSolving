package app.problem_solving.code_forces;

import java.util.Scanner;

public class Inbox {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] number = new int[size];
        int ones = 0;

        for (int i = 0; i < size; i++) {
            number[i] = scanner.nextInt();
            if (number[i] == 1) {
                ones++;
            }
        }
        int result = 0;
        for (int i = 0; i < size - 1; i++) {
            if (number[i] == 1) {
                ones--;
                if (ones > 0) {
                    result += 2;
                    if (number[i + 1] == 1) {
                        result--;
                    }
                } else {
                    result++;
                }
            }
        }

        if (number[size - 1] == 1) {
            result++;
        }

        System.out.println(result);
    }

}
