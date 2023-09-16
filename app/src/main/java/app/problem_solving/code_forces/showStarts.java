package app.problem_solving.code_forces;

import java.util.Scanner;

class showStarts {

   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      System.out.println("Welcome To Show Stars");
      System.out.println("Enter stars rows --> ");
      int rows = input.nextInt();
      System.out.println("Enter stars columns --> ");
      int columns = input.nextInt();


      for (int i = 0 ; i < rows ; i++)
      {
         for (int j = 0 ; j < columns ; j++)
         {
            System.out.print("*");
         }
         System.out.println("");
      }

   }
}
