package app.problem_solving.code_forces;

import java.util.Scanner;

public class Coins {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int coins = scanner.nextInt();

        while (coins != 1) {
            System.out.println(coins + " ");
            for (int i = 2; i <= coins; i++) {
                if (coins % i == 0) {
                    coins /= i;
                    break;
                }
            }
        }
        System.out.println(coins);
    }
}
