package app.problem_solving.code_forces;

import java.util.Scanner;

public class CaisaAndPylons {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int br = scanner.nextInt();
        int arr[] = new int[br];
        for (int i = 0; i < br; i++) {
            arr[i] = scanner.nextInt();
        }

        int dollars = arr[0];
        int energy = 0;
        for (int i = 0; i < br - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                energy += arr[i] - arr[i + 1];
            } else {
                if (energy >= Math.abs(arr[i] - arr[i + 1])) {
                    energy -= Math.abs(arr[i] - arr[i + 1]);
                } else {
                    dollars += Math.abs(arr[i] - arr[i + 1]) - energy;
                    energy = 0;
                }
            }
        }
        System.out.println(dollars);

    }

}
