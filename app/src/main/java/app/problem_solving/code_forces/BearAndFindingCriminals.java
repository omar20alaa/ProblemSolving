package app.problem_solving.code_forces;

import java.util.Scanner;

public class BearAndFindingCriminals {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int city_num = scanner.nextInt();
        int position = scanner.nextInt();
        int[] arr = new int[city_num + 1];
        int sum = 0;

        for (int i = 0; i < city_num; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        for (int i = 0; i < position && i <= city_num - position; i++) {
            if (arr[position + i] + arr[position - i] == 1) {
                sum--;
            }
        }
        System.out.println(sum);
    }

}
