package app.problem_solving.code_forces;

import java.util.Scanner;

public class RegularBracketSequence {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char [] array = scanner.next().toCharArray();
        int size = array.length;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '(') {
                counter++;
            } else {
                counter--;
                if (counter < 0) {
                    size--;
                    counter = 0;
                }
            }
        }
        System.out.println(size - counter);
    }

}
