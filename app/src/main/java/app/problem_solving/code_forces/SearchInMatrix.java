package app.problem_solving.code_forces;

import java.util.Scanner;

public class SearchInMatrix {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int[][] arr = new int[row][column];
        int is_exist = 0;


        // input array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        // search in array
        int search_value = scanner.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (arr[i][j] == search_value) {
                    is_exist = 1;
                    break;
                }
            }
        }
        if (is_exist == 1) {
            System.out.println("will not take number");
        } else {
            System.out.println("will take number");
        }
    }

}
