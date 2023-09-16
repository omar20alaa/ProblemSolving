package app.problem_solving.code_forces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lecture {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
         int words_num = scanner.nextInt();
         int words = scanner.nextInt();

        Map<String , String> my_words = new HashMap<>();

        for (int i = 0; i < words; i++) {
            String val_1 = scanner.next();
            String val_2 = scanner.next();

            if (val_1.length() <= val_2.length()) {
                my_words.put(val_1 , val_1);
                my_words.put(val_2 , val_1);
            } else {
                my_words.put(val_2 , val_2);
                my_words.put(val_1 , val_2);
            }
        }

        for (int i = 0; i < words_num; i++) {
            String word = scanner.next();
            System.out.print(my_words.get(word) + " ");
        }

    }


}
