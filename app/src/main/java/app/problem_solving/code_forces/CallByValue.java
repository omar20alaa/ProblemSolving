package app.problem_solving.code_forces;

class CallByValue {


   public static void main(String[] args) {

      int x = 50, y = 150;
      swap(x, y);

   }

  static void swap(int x, int y) {
      int temp = x;
      x = y;
      y = temp;
     System.out.println("x --> " + x);
     System.out.println("y --> " + y);
   }

}
