package app.problem_solving.code_forces;

import java.util.Scanner;

public class StonesOnTheTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num_stones = scanner.nextInt();
        int counter = 0;
        String value = scanner.next();
        char [] my_values = value.toCharArray();
        for (int i = 0; i < num_stones; i++) {
            if (i != num_stones - 1 && my_values[i] == my_values[i + 1]) {
                counter++;
            }
        }
        System.out.println(counter);
    }

}
