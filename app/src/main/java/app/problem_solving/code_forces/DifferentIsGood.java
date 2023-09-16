package app.problem_solving.code_forces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DifferentIsGood {

    public static void main(String[] args) {

        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        if (size >= 27) {
            System.out.println(-1);
        }
        String value = scanner.next();
        Map<Character, Integer> difference = new HashMap<>();
        for (int i = 0; i < size; i++) {
            char my_char = value.charAt(i);
            if (difference.containsKey(my_char)) {
                difference.put(my_char, difference.get(my_char) + 1);
            } else {
                difference.put(my_char, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : difference.entrySet()) {
            if (entry.getValue() > 1) {
                counter += entry.getValue() - 1;
            }
        }
        System.out.println(counter);

    }
}
