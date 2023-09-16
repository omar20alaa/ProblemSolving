package app.problem_solving.code_forces;

import java.util.Scanner;

public class LongestUncommonSubsequence {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String value_1 = scanner.next();
        String value_2 = scanner.next();

        if (value_1.length() > value_2.length()) {
            System.out.println(value_1.length());
        } else if (value_2.length() > value_1.length()) {
            System.out.println(value_2.length());
        } else if (value_1.equals(value_2)){
            System.out.println("-1");
        }

    }

}
