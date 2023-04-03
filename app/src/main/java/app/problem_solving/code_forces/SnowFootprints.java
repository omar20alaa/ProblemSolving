package app.problem_solving.code_forces;

import java.util.Scanner;

public class SnowFootprints {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        char[] path = scanner.next().toCharArray();
        int first = 0;
        int last = 0;
        for (int i = 0; i < size; i++) {
            if (path[i] != '.') {
                first = i;
                break;
            }
        }
        for (int i = size - 1; i >= 0; i--) {
            if (path[i] != '.') {
                last = i;
                break;
            }
        }

        if (path[first] == 'R' && path[last] == 'R') {
            System.out.println((first + 1) + " " + (last + 2));
        } else if (path[first] == 'L' && path[last] == 'L') {
            System.out.println((last + 1) + " " + (first));
        } else {
            for (int i = first; i < size; i++) {
                last = i;
                if (path[i] == 'L') {
                    break;
                }
            }
            System.out.println((first + 1) + " " + last);

        }
    }


}
