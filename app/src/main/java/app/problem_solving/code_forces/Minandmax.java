package app.problem_solving.code_forces;

import java.util.Scanner;

public class Minandmax {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        int min = arr[0],  max = arr[0];
        for (int i = 0; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
         else if (arr[i] > max){
                max = arr[i];
            }
        }



        System.out.print(min + " " + max);


    }

}
