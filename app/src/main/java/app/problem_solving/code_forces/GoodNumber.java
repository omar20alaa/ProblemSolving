package app.problem_solving.code_forces;

import java.util.Scanner;

public class GoodNumber {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int range = scanner.nextInt();
        String my_num = "0123456789";
        int counter_1 = 0;
        int counter_2 = 0;

        for (int i = 0; i < size; i++) {
            String value = scanner.next();
            for (int x = 0; x < range + 1; x++) {
                if (value.contains(my_num.substring(x, x + 1))) {
                    counter_1++;
                }
            }

            if (counter_1 >= range + 1) {
                counter_2++;
            }
            counter_1 = 0;
        }
        System.out.println(counter_2);
    }

}
