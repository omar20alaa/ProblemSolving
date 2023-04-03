package app.problem_solving.code_forces;

import java.util.Scanner;

public class AmericanFootball {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int players_num = scanner.nextInt();
        int min_height = scanner.nextInt();
        int max_height = scanner.nextInt();
        int total_height = scanner.nextInt();

        int Min = max_height + (min_height * (players_num - 1));
        int Max = min_height + (max_height * (players_num - 1));


        if (total_height <= Max && total_height >= Min) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }


}
