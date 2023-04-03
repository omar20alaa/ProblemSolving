package app.problem_solving.code_forces;

import java.util.Scanner;

public class Char {

    // 97 capital character - 65 small character = 32
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char input_char = scanner.next().charAt(0);
        int cha = (int) input_char;
        if (cha >= 97) {
            System.out.println((char) (cha - 32));
        } else {
            System.out.println((char) (cha + 32));
        }
    }

}
