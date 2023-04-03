package app.problem_solving.code_forces;

import java.util.Scanner;

public class Presents {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] nums = new int[size + 1];

        for (int i = 1; i <= size; i++) {
            nums[scanner.nextInt()] = i;
        }

        for (int i = 1; i <= size; i++) {
            System.out.print(nums[i] + " ");
        }

    }

}
