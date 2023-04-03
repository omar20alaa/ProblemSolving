package app.problem_solving.code_forces;

import java.util.Scanner;

public class Neighbors {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double size = scanner.nextDouble();

        double c = Math.ceil(Math.sqrt(Math.pow(a,2) + Math.pow(b,2)));
        long length = (long) Math.ceil(c / size);
        System.out.println(length * length);

    }

}
