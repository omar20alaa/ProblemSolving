package app.problem_solving.code_forces;

import java.util.Scanner;

public class PetyaAndJava {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            long number = scanner.nextInt();
            if (number <= 127) {
                System.out.println("byte");
            } else if (number <= 32767) {
                System.out.println("short");
            } else if (number <= 2147483647) {
                System.out.println("int");
            } else {
                System.out.println("long");
            }
        } catch (Exception e) {
            System.out.println("Big Number");
        }
    }

}
