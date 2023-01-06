package app.problem_solving.code_forces;

import java.util.Scanner;

public class PUM {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int counter = 1;
        for (int i = 1; i <= number; i++) {
            if (counter % 4 == 0) {
                System.out.println(" PUM");
                counter++;
                i--;
            } else {
                System.out.print(counter++ + " " + counter++ + " " + counter++);
            }
        }
        System.out.println(" PUM");

    }

}
