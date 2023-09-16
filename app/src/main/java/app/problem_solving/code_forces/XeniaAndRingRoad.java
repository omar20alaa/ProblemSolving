package app.problem_solving.code_forces;
import java.util.Scanner;

public class XeniaAndRingRoad {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long num_houses = scanner.nextInt();
        long tasks = scanner.nextInt();

        long result = 0;
        long point = 1;
        for (int i = 0; i < tasks; i++) {
            long house = scanner.nextInt();
            if (house >= point) {
                result += house - point;
            } else {
                result += (num_houses - point) + house;
            }
            point = house;
        }

        System.out.println(result);
    }

}
