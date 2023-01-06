package app.problem_solving.code_forces;

import java.util.Scanner;

public class NightAtTheMusem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int start = 97;
        int moves = 0;
        String value = scanner.next();
        for (int i = 0; i < value.length(); i++) {
            int result = Math.abs(value.toCharArray()[i] - start);
            if (result <= 13) {
                moves += result;
            } else {
                moves += (26 - result);
            }
            start = value.toCharArray()[i];
        }


        System.out.println(moves);

    }

}
