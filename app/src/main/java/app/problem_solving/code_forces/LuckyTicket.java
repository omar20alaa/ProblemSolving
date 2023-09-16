package app.problem_solving.code_forces;

import java.util.Scanner;

public class LuckyTicket {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String value = scanner.next();
        int sum_1 = 0;
        int sum_2 = 0;
        int domain = size / 2;
        boolean result = true;
        for (int i = 0; i < size; i++) {
            char my_char = value.charAt(i);
            if (my_char != '4' && my_char != '7') {
                result = false;
                break;
            }
            int newMyChar = Integer.parseInt(my_char + "");
            if (i < domain) {
                sum_1 += newMyChar;
            } else {
                sum_2 += newMyChar;
            }
        }
        if (result && sum_1 == sum_2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
