package app.problem_solving.code_forces;

import java.util.Scanner;

public class Bonapity {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            String first_word = scanner.next().toLowerCase();
            String second_word = scanner.next().toLowerCase();

            first_word = first_word.replaceAll("p", "b");
            first_word = first_word.replaceAll("i", "e");

            second_word = second_word.replaceAll("p", "b");
            second_word = second_word.replaceAll("i", "e");

            System.out.println(first_word.equals(second_word) ? "Yes" : "No");

        }


    }

}
