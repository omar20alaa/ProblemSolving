package app.problem_solving.code_forces;

import java.util.Scanner;

public class Decoding {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String given_text = scanner.next();
        String final_text = "";
        int i = 0;

        while (num != 0) {
            if (num % 2 != 0) {
                final_text = final_text + given_text.toCharArray()[i];
            } else {
                final_text = given_text.toCharArray()[i] + final_text;
            }
            num--;
            i++;
        }
        System.out.println("final text --> " + final_text);

    }

}
