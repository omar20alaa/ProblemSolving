package app.problem_solving.code_forces;

import java.util.Scanner;

public class NextTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int solved_num = scanner.nextInt();
        int start = 1;
        int [] num = new int[solved_num];

        for (int i = 0; i < solved_num; i++) {
            num[i] = scanner.nextInt();
        }
        sort_array(num);

        for (int i = 0; i < solved_num; i++) {
            if (!(num[i] == start)) {
                break;
            }
            start++;
        }
        System.out.println(start);
    }


    public static void sort_array(int[] intArray) {
        int temp = 0;
        // sort array
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i+1 ; j < intArray.length; j++) {
                if (intArray[i] > intArray[j]) {
                    temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
    }


}
