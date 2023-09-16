package app.problem_solving.code_forces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HelpfulMaths {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String value = scanner.next();
        List nums = new ArrayList();
        for (int i = 0; i < value.length(); i += 2) {
            nums.add(value.charAt(i));
        }
        Collections.sort(nums);
        System.out.print(nums.get(0));
        for (int i = 1; i < nums.size(); i++) {
            System.out.print("+" + nums.get(i));
        }
    }
}
