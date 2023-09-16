package app.problem_solving.code_forces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MirroredString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int flag = 0;
        List my_char = new ArrayList();
        my_char.add('A');
        my_char.add('H');
        my_char.add('I');
        my_char.add('M');
        my_char.add('O');
        my_char.add('T');
        my_char.add('U');
        my_char.add('V');
        my_char.add('W');
        my_char.add('X');
        my_char.add('Y');

        while (size-- > 0) {
            String value = scanner.next();
            StringBuilder string_buffer = new StringBuilder(value);
            String new_value = string_buffer.reverse().toString();
            if (value.equalsIgnoreCase(new_value)) {
                for (int i = 0; i < value.length(); i++) {
                    if (my_char.contains(value.charAt(i))) {
                        continue;
                    } else {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
                flag = 0;
            } else {
                System.out.println("no");
            }
        }
    }

}
