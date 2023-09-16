package app.problem_solving.code_forces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AnAbandonedSentimentFromPast {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size_1 = scanner.nextInt();
        int size_2 = scanner.nextInt();

        int arr_1[] = new int[size_1];
        List<Integer> arr_2 = new ArrayList();

        for (int i = 0; i < size_1; i++) {
            arr_1[i] = scanner.nextInt();
        }

        for (int i = 0; i < size_2; i++) {
            arr_2.add(scanner.nextInt());
        }

        Collections.sort(arr_2);

        int z = size_2 - 1;
        for (int i = 0; i < size_1; i++) {
            if (arr_1[i] == 0) {
                arr_1[i] = arr_2.get(z);
                z--;
            }
        }
        String result = "No";
        for (int i = 0; i < size_1 - 1; i++) {
            if (arr_1[i] >= arr_1[i + 1]) {
                result = "Yes";
                break;
            }
        }
        System.out.println(result);

    }


}
