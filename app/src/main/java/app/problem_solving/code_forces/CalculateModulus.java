package app.problem_solving.code_forces;

import java.util.Scanner;

class CalculateModulus {


   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      System.out.println("Welcome Average Calculator");
      System.out.println("Enter first number --> ");
      int x = input.nextInt();
      System.out.println("Enter second number --> ");
      int y = input.nextInt();

      int division = x / y;
      int modulus = x % y;

      System.out.println("Division --> " + division);
      System.out.println("Modulus = --> " + modulus);


   }



}
