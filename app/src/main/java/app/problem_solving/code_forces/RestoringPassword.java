package app.problem_solving.code_forces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RestoringPassword {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String value = scanner.next();
        Map<String, Integer> maps = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            maps.put(scanner.next(), i );
        }
        for (int i = 0; i < 80; i += 10) {
            String val = value.substring(i, i + 10);
            System.out.print(maps.get(val));
        }

    }


}
