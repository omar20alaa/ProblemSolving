package app.problem_solving.code_forces;

import java.util.Scanner;

public class VanyaAndFence {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num_of_friends = scanner.nextInt();
        int fence_height = scanner.nextInt();
        int arr[] = new int[num_of_friends];
        int counter = 0;

        for (int i = 0; i < num_of_friends; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] <= fence_height) {
                counter += 1;
            } else if (arr[i] > fence_height) {
                counter += 2;
            }
        }
        System.out.println(counter);

    }


}
