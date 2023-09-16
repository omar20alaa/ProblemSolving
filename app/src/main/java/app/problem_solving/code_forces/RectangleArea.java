package app.problem_solving.code_forces;

import java.util.Scanner;

class RectangleArea {

   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      System.out.println("Welcome to Rectangle area calculator");
      System.out.println("Enter height --> ");

      int x = input.nextInt();
      System.out.println("Enter Width --> ");
      int y = input.nextInt();
      int z = x * y;

      System.out.println("area --> " + z);


   }
}
