package app.problem_solving.code_forces;

import java.util.Scanner;

public class MishkaAndGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rounds = scanner.nextInt();
        int counter_1 = 0;
        int counter_2 = 0;
        for (int i = 0; i < rounds; i++) {
            int val_1 = scanner.nextInt();
            int val_2 = scanner.nextInt();
            if (val_1 > val_2) {
                counter_1++;
            } else {
                counter_2++;
            }
        }
        if (counter_1 > counter_2) {
            System.out.println("Mishka");
        } else if (counter_2 > counter_1) {
            System.out.println("Chris");
        } else {
            System.out.println("Friendship is magic!^^");
        }
    }
}
