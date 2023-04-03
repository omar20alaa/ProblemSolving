package app.problem_solving.code_forces;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Supermarket {

    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int superMarket = scanner.nextInt();
        int numKilo = scanner.nextInt();

        Map<Double , Double> apples = new TreeMap<>();

        for (int i = 0; i < superMarket; i++) {
            Double price = scanner.nextDouble();
            Double kilos = scanner.nextDouble();

            Double result = price / kilos;
            apples.put(result , result * numKilo);

        }
        System.out.println(apples.values().stream().findFirst().get());

    }
}
