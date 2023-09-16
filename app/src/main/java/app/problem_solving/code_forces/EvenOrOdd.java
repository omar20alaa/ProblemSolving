package app.problem_solving.code_forces;

import java.util.Scanner;

class EvenOrOdd {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Even Or Odd");
        System.out.println("Enter first number --> ");
        int x = input.nextInt();

        if (x % 2 == 0)
            System.out.println("Number is even");
        else
            System.out.println("Number is odd");

    }


}
