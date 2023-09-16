package app.problem_solving.code_forces;

import java.util.Scanner;

class SortingArray {


   public static void main(String[] args) {

      System.out.println("Welcome To Sorting Array");


      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter array size");
      int size = scanner.nextInt();
      int [] x = new int[size];

      System.out.println("Enter array element");
      for(int i = 0 ; i < size ; i++)
      {
         x[i] = scanner.nextInt();
      }

      // sorting logic
      for(int j = 0 ; j < size ; j++)
      {
         // get minimum
         int min = x[j];
         int min_index = j;
         for (int i = j; i < size; i++)
         {
            if (x[i] < min) {
               min = x[i];
               min_index = i;
            }
         }

         // swapping
         int temp = x[j];
         x[j] = x[min_index];
         x[min_index] = temp;
      }


      for(int i = 0 ; i < size ; i++)
      {
         System.out.print(x[i] + "\t");
      }



   }

}
