package app.problem_solving.code_forces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NewPassword {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int char_num = scanner.nextInt();
        List<Character> myChars = new ArrayList<>();
        List<Character> password = new ArrayList<>();

        for (int i = 97; i < 97 + char_num; i++) {
            myChars.add((char) i);
        }
        int pointer = 0;
        for (int i = 0; i < size; i++) {
            password.add(myChars.get(pointer));
            if (pointer == myChars.size() - 1)
                pointer = 0;
            else
                pointer++;

            System.out.print(password.get(i));

        }


    }
}
