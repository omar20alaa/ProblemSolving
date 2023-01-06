package app.problem_solving.code_forces;

import java.util.Scanner;

public class Suffix_Three {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            String value = scanner.next();
            int length = value.toCharArray().length;

            if (length >= 4) {
                if (value.substring(length - 2).equals("po"))
                {
                    System.out.println("FILIPINO");
                }
                if (value.substring(length - 4).equals("desu") || value.substring(length - 4).equals("masu")) {
                    System.out.println("JAPANESE");
                } else if (value.substring(length - 5).equals("mnida")) {
                    System.out.println("KOREAN");
                }
            } else {
                System.out.println("FILIPINO");
            }
        }

    }


}
