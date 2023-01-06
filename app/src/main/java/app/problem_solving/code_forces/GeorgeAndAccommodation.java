package app.problem_solving.code_forces;

import java.util.Scanner;

public class GeorgeAndAccommodation {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt(); // 3
        int counter = 0;

        for (int i = 0; i < size; i++) {
            int num_1 = scanner.nextInt();
            int num_2 = scanner.nextInt();
            if (num_2 - num_1 >= 2) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
