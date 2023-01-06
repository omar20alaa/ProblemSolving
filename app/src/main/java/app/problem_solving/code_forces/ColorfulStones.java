package app.problem_solving.code_forces;

import java.util.Scanner;

public class ColorfulStones {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String value = scanner.next();
        String instructions = scanner.next();
        int counter = 1;
        int x = 0;

        for (int i = 0; i < instructions.length(); i++) {
            if (value.toCharArray()[x] == instructions.toCharArray()[i]) {
                counter++;
                x++;
            }
        }
        System.out.println(counter);

    }


}
