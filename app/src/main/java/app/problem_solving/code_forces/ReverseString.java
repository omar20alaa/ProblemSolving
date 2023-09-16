package app.problem_solving.code_forces;

import java.util.Stack;

class ReverseString {


    public static void main(String[] args) {

        String s = "Omar Love Programming";
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            stack.push(c);
        }

        StringBuilder temp = new StringBuilder();

        while (!stack.isEmpty()) {
            temp.append(stack.pop());
        }

        System.out.println("Reversed string is : " + temp);


    }


//      String str= "Geeks", newString="";
//      char ch;
//
//      System.out.print("Original word: ");
//      System.out.println("Geeks"); //Example word
//
//      for (int i=0; i<str.length(); i++)
//      {
//         ch= str.charAt(i); //extracts each character
//         newString= ch+newString; //adds each character in front of the existing string
//      }
//
//      System.out.println("Reversed word: "+ newString);
//
//   }


}
