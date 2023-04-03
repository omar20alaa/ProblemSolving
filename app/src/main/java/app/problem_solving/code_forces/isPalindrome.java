package app.problem_solving.code_forces;

import java.util.Scanner;

public class isPalindrome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(isPalindrome(scanner.nextLine()));
    }

    private static boolean isPalindrome(String text) {
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
