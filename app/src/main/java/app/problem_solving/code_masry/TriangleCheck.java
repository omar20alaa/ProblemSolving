package app.problem_solving.code_masry;

import java.util.Scanner;

class TriangleCheck {


   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      System.out.println("Welcome To Triangle Check");
      System.out.println("Enter first number --> ");
      int x = input.nextInt();
      System.out.println("Enter second number --> ");
      int y = input.nextInt();
      System.out.println("Enter third number --> ");
      int z = input.nextInt();


      if (x + y > z && x + z > y && y + z > x)
         System.out.println("Triangle is Valid ");
      else
         System.out.println("Triangle is Not Valid ");
   }



}
