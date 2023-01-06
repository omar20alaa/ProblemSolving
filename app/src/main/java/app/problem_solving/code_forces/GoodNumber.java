package app.problem_solving.code_forces;

import java.util.Scanner;

public class GoodNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt(); // 10
        int range = scanner.nextInt(); // from 0 to 6
        int result = 0;
        int counter = 0;

        // size = 10
        for (int i = 0; i < size; i++) {
            // 123456706
            String num = scanner.next();
            // size 7
            for (int j = 0; j < num.length(); j++) {
                counter = 0;
                // loop on numbers
                for (int a = 0; a <= range; a++) {
                    if (num.contains(String.valueOf(a))) {
                        counter++;
                    }
                }
            }
            if (counter == range + 1) {
                result++;
            }
        }
        System.out.println(result);
    }

}
