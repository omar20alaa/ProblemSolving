package app.problem_solving.code_forces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BlackSquare {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int result = 0;
        Map<Integer, Integer> steps = new HashMap<>();
        for (int i = 1; i <= 4; i++) {
            steps.put(i, scanner.nextInt());
        }

        char[] arr = scanner.next().toCharArray();
        for (int i = 0; i < arr.length; i++) {
            result += steps.get(arr[i] - 48);
        }
        
        System.out.println(result);

    }


}
