package app.problem_solving.code_forces;

import java.util.Scanner;

public class AnotherOneBitesTheDust {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long num_1 = scanner.nextInt();
        long num_2 = scanner.nextInt();
        long num_3 = scanner.nextInt();


        long char_a = num_1 + num_3; //4
        long char_b = num_2 + num_3; //3

        if (char_a > char_b) {
            System.out.println((char_b * 2) + 1) ;
        } else if (char_b > char_a) {
            System.out.println((char_a * 2) + 1) ;
        } else {
            System.out.println(char_a + char_b);
        }

    }

}
