package app.problem_solving.code_forces;

import java.util.Scanner;

public class EffectiveApproach {

    public static void main(String[] args) {

        int number;
        long compare_left = 0;
        long compare_right = 0;
        Scanner scanner = new Scanner(System.in);
        int num_array = scanner.nextInt();
        int [] nums = new int[1000000];
        for (int i = 0; i < num_array; i++) {
            number = scanner.nextInt();
            nums[number] = i + 1;
        }
        int search_num = scanner.nextInt();
        int needed_num ;
        for (int i = 0; i < search_num; i++) {
            needed_num = scanner.nextInt();
            compare_left += nums[needed_num];
            compare_right += (num_array - nums[needed_num]) + 1 ;
        }
        System.out.println(compare_left + " " + compare_right);

    }
}
