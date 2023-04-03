package app.problem_solving.code_forces;

import java.util.Scanner;

public class PoliceRecruits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int events = scanner.nextInt();
        int police = 0;
        int untreated_issue = 0;

        for (int i = 0; i < events; i++) {
            int event = scanner.nextInt();
            if (event == -1) {
                if (police == 0) {
                    untreated_issue++;
                } else {
                    police--;
                }
            } else {
                police += event;
            }
        }

        System.out.println("Untreated Issues --> " + untreated_issue);

    }
}
