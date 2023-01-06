package app.problem_solving.code_forces;

import java.util.Scanner;

public class Some_Sums {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num_1 = scanner.nextInt();
        int num_2 = scanner.nextInt();
        int num_3 = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= num_1; i++) {
            if (i / 10 == 0) {
                if (i >= num_2 && i <= num_3) {
                    sum += i;
                }
            } else {
                int num = i;
                int my_sum = 0;
                while (num != 0) {
                    int final_num = num % 10;
                    my_sum += final_num;
                    num /= 10;
                }
                if (my_sum >= num_2 && my_sum <= num_3) {
                    sum += i;
                }
            }
        }
        System.out.println(sum);
    }
}
