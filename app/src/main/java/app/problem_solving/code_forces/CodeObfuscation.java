package app.problem_solving.code_forces;

import java.util.Scanner;

public class CodeObfuscation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String code = scanner.next();

        char []arr = new char[code.length()];
        if (code.charAt(0) == 'a') {
            arr[0] = 'a';
            for (int i = 1; i < code.length(); i++) {
                for (int z = 0; z < code.length(); z++) {
                    // subtract to get asci code
                    if (code.charAt(i) == arr[z] || code.charAt(i) - arr[z] == 1) {
                        arr[i] = code.charAt(i);
                        break;
                    }
                }
            }

            boolean flag = true;
            for (int i = 0 ; i < code.length() ; i++){
                if (code.charAt(i) != arr[i]) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        } else {
            System.out.println("NO");
        }


    }

}
