package app.problem_solving.code_forces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Horseshoe {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set<Integer> num = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            num.add(scanner.nextInt());
        }

        System.out.println(4 - num.size());
    }


}
