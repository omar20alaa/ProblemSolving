package app.problem_solving.code_forces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LuckyNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> my_nums = new ArrayList<>();
        my_nums.add(4);
        my_nums.add(7);
        my_nums.add(44);
        my_nums.add(47);
        my_nums.add(74);
        my_nums.add(77);
        my_nums.add(444);
        my_nums.add(447);
        my_nums.add(474);
        my_nums.add(477);
        my_nums.add(774);
        my_nums.add(777);
        my_nums.add(747);
        my_nums.add(744);
        my_nums.add(4444);
        my_nums.add(4447);
        my_nums.add(4474);
        my_nums.add(4477);
        my_nums.add(4777);
        my_nums.add(4744);
        my_nums.add(4774);
        my_nums.add(4747);
        my_nums.add(7777);
        my_nums.add(7774);
        my_nums.add(7747);
        my_nums.add(7474);

        int num_1 = scanner.nextInt();
        int num_2 = scanner.nextInt();
        int flag = 0;
        for (int i = num_1; i <= num_2; i++) {
            if (my_nums.contains(i)) {
                System.out.print(i + " ");
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println(-1);
        }

    }

}
