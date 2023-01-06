package app.problem_solving.code_forces;

import java.util.Scanner;

public class Team {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int question_num = scanner.nextInt();
        int counter = 0;

        for (int i = 0; i < question_num; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                int answer = scanner.nextInt();
                total += answer;
            }
            if (total >= 2) {
                counter++;
            }
        }

        System.out.println(counter);

    }


}
