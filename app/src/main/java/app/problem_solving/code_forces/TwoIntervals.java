package app.problem_solving.code_forces;

import java.util.Scanner;

public class TwoIntervals {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int L1 = scanner.nextInt();
        int R1 = scanner.nextInt();
        int L2 = scanner.nextInt();
        int R2 = scanner.nextInt();

        if (R1 < L2) {
            System.out.println(-1);
            return;
        }
        if (R1 > L2) {
            System.out.println(L2 + " " + R1);
        } else {
            System.out.println(R1 + " " + L2);
        }
    }

}
