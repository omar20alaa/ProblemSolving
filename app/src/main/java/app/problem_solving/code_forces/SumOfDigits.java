package app.problem_solving.code_forces;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        int answer = 0;
        char[] nums_arr = number.toCharArray();
        ArrayList<Character> array = new ArrayList<>();


        if (nums_arr.length == 1) {
            System.out.println('0');
            return;
        }
        for (int i = 0; i < nums_arr.length; i++) {
            answer += nums_arr[i] - '0';
        }

        int counter = 1;
        while (answer >= 10) {
            answer = sum(answer);
            counter++;
        }
        System.out.println(counter);


    }

    public static int sum(int num) {
        int result = 0;
        while (num != 0) {
            result += num % 10;
            num /= 10;
        }
        return result;
    }


}
