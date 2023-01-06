package app.problem_solving.code_forces;

import java.util.Scanner;

public class YaroslavAndPermutations {

    public static void main(String[] args) {

        int result = 0;

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }


        for (int i = 0; i < size; i++) {
            int pointer = 0;
            for (int j = 0; j < size; j++) {
                if (nums[i] == nums[j]) {
                    pointer++;
                }
                if (pointer > result)
                    result = pointer;
            }
        }
        if (size % 2 == 0) {
            if (result <= size / 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            if (result <= (size / 2) + 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }


    }


}
