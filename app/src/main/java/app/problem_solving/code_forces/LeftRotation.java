package app.problem_solving.code_forces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeftRotation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int rotation = scanner.nextInt();
        int[] nums = new int[size];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }

        List result = new ArrayList();

        for (int i = rotation; i < size; i++) {
            result.add(nums[i]);
        }

        for (int i = 0; i < rotation; i++) {
            result.add(nums[i]);
        }

        for (int i = 0; i < size; i++) {
            System.out.print(result.get(i) + " ");
        }

    }

}
