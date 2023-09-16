package app.problem_solving.code_forces;

import java.util.Scanner;

class AverageThreeNumbers {

   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      System.out.println("Welcome Average Calculator");
      System.out.println("Enter first number --> ");
      int x = input.nextInt();
      System.out.println("Enter second number --> ");
      int y = input.nextInt();
      System.out.println("Enter third number --> ");
      int z = input.nextInt();
      int result = (x + y + z ) / 3;


      System.out.println("Average --> " + result);


   }


}
