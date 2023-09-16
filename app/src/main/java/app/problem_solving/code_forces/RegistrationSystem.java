package app.problem_solving.code_forces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RegistrationSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        Map<String, Integer> database = new HashMap<>();

        for (int i = 0; i < size; i++) {
            String email = scanner.next();
            if (!database.containsKey(email)) {
                System.out.println("Ok");
                database.put(email, 0);
            } else {
                int result = database.get(email) + 1;
                System.out.println(email + result);
                database.put(email, result);
            }
        }

    }

}
